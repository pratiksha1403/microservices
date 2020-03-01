package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class Doctor1Application {

	public static void main(String[] args) {
		SpringApplication.run(Doctor1Application.class, args);
	}

}
