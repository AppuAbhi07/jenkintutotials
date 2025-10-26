package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;



@SpringBootApplication
public class JenkingTutotialsApplication {
	
	
	public static Logger log = LoggerFactory.getLogger(JenkingTutotialsApplication.class);
	
	@PostConstruct
	public void init() {
		log.info("application started...");
	}

	public static void main(String[] args) {
		
		log.info("Appllication is executed");
		
		SpringApplication.run(JenkingTutotialsApplication.class, args);
	}

}
