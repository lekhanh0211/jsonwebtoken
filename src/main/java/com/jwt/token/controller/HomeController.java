package com.jwt.token.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo")
public class HomeController {
    @GetMapping
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello, Welcome Json web token!");
    }
}
