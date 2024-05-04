package com.example.basicspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.basicspring")
public class BasicspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicspringApplication.class, args);

	}

}
