package com.db.demo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	@Autowired
	UserRepository userRepo;

	@Autowired
	southernhmRepository shmRepo;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@PostConstruct
	public void init(){
		shmRepo.save(new southernhemispheremonthly("1840-1", -0.44851005000));
	}
	
		}



	

	


