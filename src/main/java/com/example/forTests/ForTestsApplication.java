package com.example.forTests;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.example.forTests.entity")
public class ForTestsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ForTestsApplication.class, args);
	}

}
