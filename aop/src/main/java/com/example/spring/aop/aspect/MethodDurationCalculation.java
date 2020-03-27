package com.example.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;


//aop
//configuration 
@Aspect
@Configuration
public class MethodDurationCalculation {
	
	Logger logger = LoggerFactory.getLogger(MethodDurationCalculation.class);
	
	//after complete successful execution 
	@Around(value = "com.example.spring.aop.aspect.CommonJointPoint.trackTimeAnnotation()")
	public void calculationTimeForMethods(ProceedingJoinPoint proceedingJoinPoint) throws Throwable
	{
		
		//advice
		
		long startTime = System.currentTimeMillis();
		proceedingJoinPoint.proceed();
		
		long timeTaken = System.currentTimeMillis() - startTime ;
		logger.info("{} is executed in time {}",proceedingJoinPoint,timeTaken);
		
	}
	
	
}
