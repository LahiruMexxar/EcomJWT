package com.example.Ecom.Controllers;

import com.example.Ecom.Models.AuthenRequest;
import com.example.Ecom.Models.AuthenticationResponse;
import com.example.Ecom.Models.RegisterRequest;
import com.example.Ecom.Services.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    @Autowired
    private final AuthenticationService service;


    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse>register(@RequestBody RegisterRequest request){
        return ResponseEntity.ok(service.register(request));
    }

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse>register(@RequestBody AuthenRequest request){
        return ResponseEntity.ok(service.authenticate(request));
    }

}
