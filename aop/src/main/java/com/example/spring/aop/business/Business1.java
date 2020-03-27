package com.example.spring.aop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.aop.data.Dao1;

@Service
public class Business1 {
	
	
	@Autowired
	Dao1 dao1;
	
	
	public String processData() {
		return dao1.retrieveString();
	}
	

}
