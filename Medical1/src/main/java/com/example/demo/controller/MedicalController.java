package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class MedicalController {

	@GetMapping("/medical")
	public String  Medical()
	{
		return " medical shop is open..!!";
	}
}
