package com.example.Ecom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@ComponentScan
@Configuration
public class EcomApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcomApplication.class, args);
	}

}
