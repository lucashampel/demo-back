package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api")
@Slf4j
public class MyController {

	
	@GetMapping()
    public ResponseEntity<Integer> getRequest() {
		return ResponseEntity.ok(1212);
    }
	
	@GetMapping("/test")
    public ResponseEntity<Integer> getOtherRequest() {
		return ResponseEntity.ok(1212);
    }
}
