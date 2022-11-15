package com.db.demo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class DemoApplication {

	@Autowired
	UserRepository userRepo;

	@Autowired
	southernhmRepository shmRepo;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	
	
		}



	

	


