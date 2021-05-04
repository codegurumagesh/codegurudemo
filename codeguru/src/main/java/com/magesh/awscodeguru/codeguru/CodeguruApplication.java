package com.magesh.awscodeguru.codeguru;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CodeguruApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodeguruApplication.class, args);
	}
	
	@GetMapping("/greeting")
	public String greeting() {
		String testing = "Welcome to codeguru";
		return "Hello World";
	}

}
