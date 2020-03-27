package com.example.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;


//aop
//configuration 
@Aspect
@Configuration
public class AfterAccessAspect {
	
	Logger logger = LoggerFactory.getLogger(AfterAccessAspect.class);
	
	//after complete successful execution 
	@AfterReturning(value = "com.example.spring.aop.aspect.CommonJointPoint.businessLayer()",returning = "result")
	public void afterSuccessfulCompletion(JoinPoint joinPoint, Object result)
	{
		
		//advice
		logger.info("{} passed the value {}",joinPoint,result);
		
	}
	
	@AfterThrowing(value = "com.example.spring.aop.aspect.CommonJointPoint.businessLayer()",throwing = "exception")
    public void afterException(JoinPoint joinPoint, Object exception)
    {
		logger.info("{} has thrown the exception  {}",joinPoint,exception);	
    }
	
	
	@After(value = "com.example.spring.aop.aspect.CommonJointPoint.businessLayer()")
    public void afterException(JoinPoint joinPoint)
    {
		logger.info("{} is executed",joinPoint);	
    }
}
