package com.example.spring1.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class externalService {

	//load from properties
	
	@Value("${external.service.url}")
	private String url;
	
	
	public String returnUrl() {
		return url;
	}
}
