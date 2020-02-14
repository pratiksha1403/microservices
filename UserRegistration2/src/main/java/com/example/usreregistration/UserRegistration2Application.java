package com.example.usreregistration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UserRegistration2Application {

	public static void main(String[] args) {
		SpringApplication.run(UserRegistration2Application.class, args);
	}

}
