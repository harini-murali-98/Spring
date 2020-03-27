package com.example.springboot.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		ApplicationContext run = SpringApplication.run(SpringbootApplication.class, args);
		
		for(String bean : run.getBeanDefinitionNames() )
		{
			System.out.println(bean);
		}
	}

}
