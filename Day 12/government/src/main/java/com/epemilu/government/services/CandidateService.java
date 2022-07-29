package com.epemilu.government.services;

import com.epemilu.government.dto.CandidateDto;
import com.epemilu.government.models.Candidate;
import com.epemilu.government.repository.CandidateRepository;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional(rollbackOn = Exception.class)
public class CandidateService {
    @Autowired
    private CandidateRepository candidateRepository;

    @SneakyThrows(Exception.class)
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
}
