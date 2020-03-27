package com.example.spring.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.spring.aop.business.Business1;
import com.example.spring.aop.business.Business2;

@SpringBootApplication
public class AopApplication implements CommandLineRunner {
	
	
	Logger logger = LoggerFactory.getLogger(AopApplication.class);
	
	
	@Autowired
	Business1 business1;
	
	@Autowired
	Business2 business2;

	public static void main(String[] args) {
		SpringApplication.run(AopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		logger.info(business1.processData());
		logger.info(business2.processData());
		
	}

}
