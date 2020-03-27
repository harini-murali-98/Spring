package com.example.spring1.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.spring1.springBasicMain;

@Service

public class BinarySearch {
	
	public static Logger LOGGER = LoggerFactory.getLogger(BinarySearch.class);
	
	@Autowired
	
	private Sort bubbleSort;
	
	public int search(int[]  num,int key)
	{
	      int[] sortedNum =	bubbleSort.sort(num);
	      System.out.println(bubbleSort);
		return 3;
	}

	

	@PostConstruct
	public void postConstruct()
	{
		LOGGER.info("post construct");
	}
	
   @PreDestroy
	public void preDestroy()
	{
		LOGGER.info("pre Destroy");
	}
	
	

	

	

}
