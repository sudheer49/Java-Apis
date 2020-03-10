package com.practice.Api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api")
public class MainController {

	@GetMapping("/hello")
	public String helloWorld() {
		return "Hello World";
	}
}
