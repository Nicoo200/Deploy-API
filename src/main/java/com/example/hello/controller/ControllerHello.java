package com.example.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerHello {
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello world";
	}

}
