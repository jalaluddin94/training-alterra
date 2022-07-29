package com.epemilu.government.services;

import com.epemilu.government.dto.CandidateDto;
import com.epemilu.government.dto.ErrorResponse;
import com.epemilu.government.models.Candidate;
import com.epemilu.government.repository.CandidateRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.*;

@Service
@Transactional(rollbackOn = Exception.class)
public class CandidateService {
    @Autowired
    private CandidateRepository candidateRepository;

    @SneakyThrows(Exception.class)
    @ApiOperation("Add new candidate")
    public ResponseEntity<Object> add(CandidateDto candidateReq){

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        Candidate theCandidate = new Candidate();
        theCandidate.setCandidateName(candidateReq.getCandidateName());
        theCandidate.setAddress(candidateReq.getAddress());
        theCandidate.setUsername(candidateReq.getUsername());

        candidateRepository.save(theCandidate);

        return ResponseEntity.status(HttpStatus.CREATED).headers(headers).build();
    }

    @SneakyThrows(Exception.class)
    @ApiOperation("Get all candidates")
    public ResponseEntity<Object> getAll(){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        // ArrayList<Candidate> respon = new ArrayList<>();
        List<Candidate> resp = candidateRepository.findAll();

        return ResponseEntity.status(HttpStatus.OK).headers(headers).body(resp);
    }

    @SneakyThrows(Exception.class)
    @ApiOperation("Update candidate data")
    public ResponseEntity<Object> update(Long idCandidate, CandidateDto candidateReq){

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        Candidate candidate = candidateRepository.findById(idCandidate).orElse(null);
        if(Optional.ofNullable(candidate).isPresent()){
            candidate.setCandidateName(candidateReq.getCandidateName());
            candidate.setUsername(candidateReq.getUsername());
            candidate.setAddress(candidateReq.getAddress());
            candidateRepository.save(candidate);
        }else{
            ErrorResponse theError = new ErrorResponse("9999", "Data not found");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).headers(headers).body(theError);
        }

        return ResponseEntity.status(HttpStatus.OK).headers(headers).body(candidateReq);
    }

    @SneakyThrows(Exception.class)
    @ApiOperation("Delete candidate data")
    public ResponseEntity<Object> delete(Long idCandidate){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        if(Optional.ofNullable(idCandidate).isPresent()) {
            Candidate candidate = candidateRepository.findById(idCandidate).orElse(null);
            if (Optional.ofNullable(candidate).isPresent()) {
                candidateRepository.delete(candidate);
            }else{
                ErrorResponse theError = new ErrorResponse("9999", "Data not found");
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).headers(headers).body(theError);
            }
        }else{
            ErrorResponse theError = new ErrorResponse("9998", "ID not valid");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).headers(headers).body(theError);
        }

        return ResponseEntity.status(HttpStatus.OK).headers(headers).body("Delete success");
    }
}
