package com.example.spring1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.spring1.scope.PersonDAO;

import component.ComponentDAO;



@Configuration
@ComponentScan("component")
public class springComponentMain {

	public static Logger LOGGER = LoggerFactory.getLogger(springComponentMain.class);
	public static void main(String[] args) {
		//BinarySearch binSearch = new BinarySearch(new BubbleSort());
		
		ApplicationContext applicationContext =new AnnotationConfigApplicationContext(springComponentMain.class);
		ComponentDAO componentDao = applicationContext.getBean(ComponentDAO.class);
		
		
		
		LOGGER.info("{}",componentDao);
		
		
		
	}

}
