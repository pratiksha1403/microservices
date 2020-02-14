package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@EnableEurekaServer
@EnableEurekaClient
@RestController
public class SurekhaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SurekhaServerApplication.class, args);
	}

	 @RequestMapping(value = "/")
	   public String home() {
	      return "Eureka Client application";
	   }
	}

