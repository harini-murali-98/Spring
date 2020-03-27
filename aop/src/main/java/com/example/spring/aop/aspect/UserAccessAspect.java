package com.example.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;


//aop
//configuration 
@Aspect
@Configuration
public class UserAccessAspect {
	
	Logger logger = LoggerFactory.getLogger(UserAccessAspect.class);
	
	//pointer
	
	//@Before("execution(* com.example.spring.aop.business.*.*(..))")
	//weaving and weaver
	@Before("execution(* com.example.spring.aop..*.*(..))")
	public void before(JoinPoint joinPoint)
	{
		
		//advice
		logger.info("Check for user access -> {}",joinPoint);
		
	}

}
