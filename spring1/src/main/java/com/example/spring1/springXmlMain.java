package com.example.spring1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.spring1.basic.BinarySearch;
import com.example.spring1.xml.*;




public class springXmlMain {

	private  static  Logger logger =  LoggerFactory.getLogger(springXmlMain.class);
	
	public static void main(String[] args) {

		
		
		
		
		
	ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml"); 
logger.info("Beans -> {}",(Object)applicationContext.getBeanDefinitionNames());
			XmlPersonDAO personDao = applicationContext.getBean(XmlPersonDAO.class);
			logger.info("{}, {}",personDao,personDao.getXmlJdbcConnection());
		
	}

}
