package com.introjavaspringboot.web.tugas.controller;

import com.introjavaspringboot.web.tugas.request.TugasUserReq;
import com.introjavaspringboot.web.tugas.response.TugasUser;
import lombok.SneakyThrows;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class TugasController{

    @GetMapping("/users")
    @SneakyThrows(Exception.class)
    public ResponseEntity<Object> getUser(){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        Map<String, Object> res = new HashMap<>();
        ArrayList<TugasUser> tgsUser = new ArrayList<>();

        tgsUser.add(new TugasUser("HelloWorld, Jalal", "id1", "Jalan 123"));
        tgsUser.add(new TugasUser("HelloWorld, Denny", "id2", "Jalan 123"));
        tgsUser.add(new TugasUser("HelloWorld, Okky", "id3", "Jalan 123"));

        res.put("code", "200");
        res.put("message", "success");
        res.put("data",tgsUser);

        return ResponseEntity.status(HttpStatus.OK).headers(headers).body(res);
    }

    @PostMapping("/users")
    @SneakyThrows(Exception.class)
    public ResponseEntity<Object> addUser(@RequestBody TugasUserReq reqUser){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        Map<String, Object> res = new HashMap<>();
        TugasUser tgsUser = new TugasUser();

        tgsUser.setIdUser("1");
        tgsUser.setAddressUser(reqUser.getAddressUser());
        tgsUser.setNamaUser(reqUser.getNamaUser());

        res.put("code", 200);
        res.put("message", "success");
        res.put("data", tgsUser);

        return ResponseEntity.status(HttpStatus.OK).headers(headers).body(res);
    }

    @PutMapping("/users")
    @SneakyThrows(Exception.class)
    public ResponseEntity<Object> editUser(@RequestBody TugasUserReq reqUser){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        Map<String, Object> res = new HashMap<>();
        TugasUser tgsUser = new TugasUser();

        tgsUser.setIdUser("1");
        tgsUser.setAddressUser(reqUser.getAddressUser());
        tgsUser.setNamaUser(reqUser.getNamaUser());

        res.put("code", 200);
        res.put("message", "success");
        res.put("data", tgsUser);

        return ResponseEntity.status(HttpStatus.OK).headers(headers).body(res);
    }

    @DeleteMapping("/users")
    @SneakyThrows(Exception.class)
    public ResponseEntity<Object> deleteUser(String userId){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        Map<String, Object> res = new HashMap<>();

        res.put("code", 200);
        res.put("message", "success");
        res.put("data", "Hello world deleted");

        return ResponseEntity.status(HttpStatus.OK).headers(headers).body(res);
    }
}