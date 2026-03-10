package com.ems.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EmsAppApplication {
	public static void main(String[] args) {
		SpringApplication.run(EmsAppApplication.class, args);
	}
	@GetMapping("/")
	public String hello() {
		return "Spring Boot App is Running on AWS!";
	}

}
