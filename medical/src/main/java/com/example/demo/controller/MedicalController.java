package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class MedicalController {

	@GetMapping("/med")
	public String medical()
	{
	return "medical shope is open";
}
}
