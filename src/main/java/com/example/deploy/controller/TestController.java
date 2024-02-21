package com.example.deploy.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping("test")
    public ResponseEntity testGet() {
        return ResponseEntity.status(HttpStatus.OK).body("GET 성공");
    }

    @PostMapping("test")
    public ResponseEntity testPost() {
        return ResponseEntity.status(HttpStatus.CREATED).body("POST 성공");
    }
}
