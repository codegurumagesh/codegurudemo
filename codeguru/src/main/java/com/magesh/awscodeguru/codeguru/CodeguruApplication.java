package com.magesh.awscodeguru.codeguru;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Random;

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

		
		Random rand = new Random();
		
		DateFormat currentDateformat = new SimpleDateFormat("dd MM yyy");
		
		String message = "This is a message on sqs " + Double.toString(rand.nextDouble()) + " at " + currentDateformat.toString(); 
		
		System.out.println(message);
		
		return "Hello World";
	}

}
