package com.epemilu.government.services;

import com.epemilu.government.dto.CandidateDto;
import com.epemilu.government.dto.ErrorResponse;
import com.epemilu.government.models.Candidate;
import com.epemilu.government.repository.CandidateRepository;
import io.swagger.annotations.ApiOperation;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.transaction.Transactional;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

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
}
