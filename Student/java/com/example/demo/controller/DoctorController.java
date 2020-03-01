package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorController {

	@GetMapping("/doctor")
	public String Hello() {
		return "Hie these is a doctor's application";
	}
}
