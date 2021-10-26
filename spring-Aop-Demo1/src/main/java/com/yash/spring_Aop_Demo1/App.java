package com.yash.spring_Aop_Demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.yash.spring_Aop_Demo1.config.AppConfig;
import com.yash.spring_Aop_Demo1.service.Calculator;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
    	
   ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class); 
  Calculator c= context.getBean(Calculator.class);
        c.add();
        c.div();
        c.sub();
      
    }
}
