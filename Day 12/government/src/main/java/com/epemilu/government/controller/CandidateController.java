package com.epemilu.government.controller;

import com.epemilu.government.services.CandidateService;
import com.epemilu.government.dto.CandidateDto;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
@Slf4j
public class CandidateController {
    @Autowired
    private CandidateService candidateService;

    @SneakyThrows(Exception.class)
    @GetMapping(path = "/candidate", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getAllCandidates(){
        log.info("api /api/v1/candidate/getAllCandidate is executed...");
        return candidateService.getAll();
    }

    @SneakyThrows(Exception.class)
    @PostMapping(path = "/candidate", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> addCandidate(@RequestBody CandidateDto candidateData){
        log.info("api /api/v1/candidate/add is executed...");
        return candidateService.add(candidateData);
    }

    @SneakyThrows(Exception.class)
    @PutMapping(path = "/candidate/{IdCandidate}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> updateCandidate(
            @PathVariable Long IdCandidate,
            @RequestBody CandidateDto candidateData
    ){
        log.info("api /api/v1/candidate/update is executed...");
        return candidateService.update(IdCandidate, candidateData);
    }

    @SneakyThrows(Exception.class)
    @DeleteMapping(path = "/candidate/{IdCandidate}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> deleteCandidate(@PathVariable Long IdCandidate){
        log.info("api /api/v1/candidate/deleteCandidate is executed...");
        return candidateService.delete(IdCandidate);
    }
}
