package com.nicha;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Main {
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
	
	@GetMapping("/greet")
	public GreetResponse greet() {
		return new GreetResponse("Hello", List.of("Java","Golang","Javascript"), new Person("Alex"));
	}
	
	record Person(String name) {}
	
	record GreetResponse(String greet, List<String> favProgrammingLanguages,
			Person person) {}
}
