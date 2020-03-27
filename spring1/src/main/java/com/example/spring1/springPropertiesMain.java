package com.example.spring1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.AbstractApplicationContext;

import com.example.spring1.basic.BinarySearch;
import com.example.spring1.properties.externalService;




@Configuration
@ComponentScan("com.example.spring1")
@PropertySource("classpath:app.properties")
public class springPropertiesMain {
	private static Logger logger = LoggerFactory.getLogger(springPropertiesMain.class);

	public static void main(String[] args) {
		
		
		
		
		
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(springPropertiesMain.class);
		externalService bean = applicationContext.getBean(externalService.class);
		
		System.out.println(bean);
		logger.info("{}",bean.returnUrl());
		
	
		
	}

}
