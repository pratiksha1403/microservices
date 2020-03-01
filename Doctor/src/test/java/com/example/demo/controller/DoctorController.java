package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorController {
	@GetMapping("/doc")
	public String Doctor() {
		return "hello doctor is available";
	}
}
