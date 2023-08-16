package com.ruchi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@PostMapping("/msg")
public ResponseEntity<String> SaveMsg(){
	return new ResponseEntity("Hello",HttpStatus.OK);
	
}
}
