package com.example.demo.controllers;

import java.util.HashMap;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	public ResponseEntity<HashMap<String, String>> index() {
		HashMap<String, String> item = new HashMap<>();
		item.put("message", "Hello world");
		item.put("status", "OK");
		item.put("version", "1.0");
		return ResponseEntity.status(HttpStatus.OK).body(item);
	}
	
}
