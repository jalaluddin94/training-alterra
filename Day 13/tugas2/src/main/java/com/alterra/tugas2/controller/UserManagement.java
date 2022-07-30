package com.alterra.tugas2.controller;

import com.alterra.tugas2.services.UserRoleService;
import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.alterra.tugas2.model.AppUser;
import com.alterra.tugas2.model.Role;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.URI;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1")
public class UserManagement {
    @Autowired
    private UserRoleService userRoleService;

    @SneakyThrows(Exception.class)
    @GetMapping("/token/refresh")
    public void refreshToken(HttpServletRequest request, HttpServletResponse response) {

        String authorizationHeader = request.getHeader("Authorization");

        if (Optional.ofNullable(authorizationHeader).isPresent() && authorizationHeader.startsWith("Bearer ")) {

            try {

                String refreshToken = authorizationHeader.substring("Bearer ".length());

                Algorithm algorithm = Algorithm.HMAC256("secret".getBytes());

                JWTVerifier verifier = JWT.require(algorithm).build();

                DecodedJWT decodedJWT = verifier.verify(refreshToken);

                String username = decodedJWT.getSubject();

                AppUser user = userRoleService.getUser(username);

                String accessToken = JWT.create().withSubject(user.getUsername())
                        .withExpiresAt(new Date(System.currentTimeMillis() + 10 * 60 * 1000))
                        .withIssuer(request.getRequestURL().toString())
                        .withClaim("roles", user.getRoles().stream().map(Role::getName).collect(Collectors.toList()))
                        .sign(algorithm);

                Map<String, Object> token = new HashMap<String, Object>();

                response.setContentType(MediaType.APPLICATION_JSON_VALUE);

                token.put("accessToken", accessToken);
                token.put("refreshToken", refreshToken);

                new ObjectMapper().writeValue(response.getOutputStream(), token);

            } catch (Exception e) {

                Map<String, Object> error = new HashMap<String, Object>();

                response.setHeader("error", e.getMessage());
                response.setStatus(HttpStatus.FORBIDDEN.value());
                response.setContentType(MediaType.APPLICATION_JSON_VALUE);

                error.put("error", e.getMessage());
                error.put("status", HttpStatus.FORBIDDEN.value());

                new ObjectMapper().writeValue(response.getOutputStream(), error);
            }

        } else {

            throw new RuntimeException("Refresh token is missing");

        }
    }

    @SneakyThrows(Exception.class)
    @PostMapping("/user/save")
    public ResponseEntity<Object> saveUser(@RequestBody AppUser appUserDto) {

        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/user/save").toUriString());

        return ResponseEntity.created(uri).body(userRoleService.saveUser(appUserDto));
    }
}
