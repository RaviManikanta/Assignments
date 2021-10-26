package com.yash.spring_Aop_Demo1.helper;
/**
 * aspect class 
 */

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
@Component
@EnableAspectJAutoProxy
@Aspect
public class Helper {
	Logger log= Logger.getAnonymousLogger();
	long starttime= System.currentTimeMillis();
	
	
//	@Before("execution(public void add())")
//	public void log() {
//		long timetaken = System.currentTimeMillis()-starttime;
//		System.out.println(timetaken);
//	log.info("before performing addition");
//	}
	
	
//	@After("execution(public void add())")
//	public void after(JoinPoint jp) {
//		
//	log.info("after performing addition");
//	long timetaken = System.currentTimeMillis()-starttime;
//	log.info(jp.getSignature().getName());
//
//	System.out.println(timetaken);
//	}
	

	@Around("execution(*  com.yash.spring_Aop_Demo1.service.Calculator.*(..))")
	public void aroundMethod(ProceedingJoinPoint pj)throws Throwable{
		log.info("around method called");
		pj.proceed();
	   log.info("around method end");
	
	}
	
	@AfterThrowing(pointcut = "execution (*  com.yash.spring_Aop_Demo1.service.Calculator.*(..))",throwing = "error")
	
	public void afterThrowing(JoinPoint jp,Throwable error)
	{
		System.out.println("method signature: "+jp.getSignature());
		System.out.println("exception "+error);
	}
	



}
