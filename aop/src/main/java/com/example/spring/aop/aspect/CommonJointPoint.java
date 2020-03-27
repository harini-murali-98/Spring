package com.example.spring.aop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJointPoint {
	
	@Pointcut("execution(* com.example.spring.aop.business.*.*(..))")
	public void businessLayer()
	{
	
	}
	@Pointcut("execution(* com.example.spring.aop.data.*.*(..))")
	public void dataLayer()
	{
	
	}

	@Pointcut("dataLayer() && businessLayer()")
	public void allLayerExecution(){}
	
	
	@Pointcut("@annotation(com.example.spring.aop.aspect.TrackTime)")
	public void trackTimeAnnotation(){}
	
}
