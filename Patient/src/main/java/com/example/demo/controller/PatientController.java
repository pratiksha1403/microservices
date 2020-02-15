package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {

	@GetMapping("/patient")
	public String patient() {
		return "hie these is a patient application";
	}
}
