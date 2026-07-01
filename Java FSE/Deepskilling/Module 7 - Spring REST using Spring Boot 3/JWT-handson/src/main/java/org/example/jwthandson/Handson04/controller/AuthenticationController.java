package org.example.jwthandson.Handson04.controller;

import org.example.jwthandson.Handson03.model.AuthenticationResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

//@RestController
public class AuthenticationController {

    @GetMapping("/authenticate")
    public AuthenticationResponse authenticate(
            @RequestHeader("Authorization") String authHeader) {

        String encoded = authHeader.substring(6);

        byte[] decoded = Base64.getDecoder().decode(encoded);

        String credentials = new String(decoded, StandardCharsets.UTF_8);

        String user = credentials.substring(0, credentials.indexOf(":"));

        System.out.println("Logged in User : " + user);

        return new AuthenticationResponse("");
    }
}