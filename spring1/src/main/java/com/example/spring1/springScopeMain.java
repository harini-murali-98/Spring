package com.example.spring1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.spring1.scope.PersonDAO;



@Configuration
@ComponentScan
public class springScopeMain {

	public static Logger LOGGER = LoggerFactory.getLogger(springScopeMain.class);
	public static void main(String[] args) {
		//BinarySearch binSearch = new BinarySearch(new BubbleSort());
		
		ApplicationContext applicationContext =new AnnotationConfigApplicationContext(springScopeMain.class);
		PersonDAO personDao1 = applicationContext.getBean(PersonDAO.class);
		PersonDAO personDao2= applicationContext.getBean(PersonDAO.class);
		
		
		LOGGER.info("{}",personDao1);
		LOGGER.info("{}",personDao1.getJdbcCon());
		LOGGER.info("{}",personDao2);
		LOGGER.info("{}",personDao2.getJdbcCon());
		
		
	}

}
