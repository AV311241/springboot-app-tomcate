package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	

	@GetMapping("")
	public String home() {
		return "automation chal rha";
	}
	
	
	@GetMapping("/test")
	public String test() {
		return "My Spring boot War app is Running";
	}
	
}
