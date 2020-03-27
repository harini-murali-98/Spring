package com.example.spring1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.spring1.basic.BinarySearch;
import com.example.spring1.cdi.CdiBusiness;



@Configuration
@ComponentScan
public class springCdiMain {

	public static void main(String[] args) {
		//BinarySearch binSearch = new BinarySearch(new BubbleSort());
		
		
		
		
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(springCdiMain.class);
		CdiBusiness bean = applicationContext.getBean(CdiBusiness.class);
		
		System.out.println(bean);

		System.out.println(bean.getCdiDao());
		
	}

}
