package com.example.spring1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;

import com.example.spring1.basic.BinarySearch;



@Configuration
@ComponentScan("com.example.spring1")
public class springBasicMain {

	public static void main(String[] args) {
		//BinarySearch binSearch = new BinarySearch(new BubbleSort());
		
		
		
		
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(springBasicMain.class);
		BinarySearch bean = applicationContext.getBean(BinarySearch.class);
		BinarySearch bean1 = applicationContext.getBean(BinarySearch.class);
		int search = bean.search(new int[] {12,232,2}, 456);
		System.out.println(bean);
		System.out.println(bean1);
		System.out.println(search);
		((AbstractApplicationContext) applicationContext).close();
		
	}

}
