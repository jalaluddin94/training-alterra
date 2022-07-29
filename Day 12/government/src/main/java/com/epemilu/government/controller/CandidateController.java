package com.epemilu.government.controller;

import com.epemilu.government.services.CandidateService;
import com.epemilu.government.dto.CandidateDto;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@Slf4j
public class CandidateController {
    @Autowired
    private CandidateService candidateService;

    @SneakyThrows(Exception.class)
    @PostMapping(path = "/candidate", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> addCandidate(@RequestBody CandidateDto dto){
        log.info("api /api/v1/candidate/add is executed...");
        return candidateService.add(dto);
    }
}
