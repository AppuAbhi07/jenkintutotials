package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;




@SpringBootApplication
@RestController
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
	
	
	@GetMapping("/test")
	public String tets() {
		return  "Succesfully deployed and running successfully....";
		
	}
	

}
