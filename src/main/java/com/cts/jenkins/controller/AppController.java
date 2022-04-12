package com.cts.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myapp")
public class AppController {

	@GetMapping
	public String displayOutput() {
		return "WELCOME HARSHAL!!!! HAVE A NICE DAY";
	}
}
