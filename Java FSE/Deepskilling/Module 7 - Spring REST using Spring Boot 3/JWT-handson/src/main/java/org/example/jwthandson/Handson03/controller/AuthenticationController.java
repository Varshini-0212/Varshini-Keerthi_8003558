package org.example.jwthandson.Handson03.controller;

import org.example.jwthandson.Handson03.model.AuthenticationRequest;
import org.example.jwthandson.Handson03.model.AuthenticationResponse;
import org.springframework.web.bind.annotation.*;

//@RestController
public class AuthenticationController {

    @PostMapping("/authenticate")
    public AuthenticationResponse authenticate(@RequestBody AuthenticationRequest request) {

        return new AuthenticationResponse("Authentication Successful");
    }
}