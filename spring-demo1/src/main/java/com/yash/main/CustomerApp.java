package com.yash.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.model.Customer;

public class CustomerApp {
public static void main(String args[]) {
	ApplicationContext context = new ClassPathXmlApplicationContext("application_context.xml");
	Customer c = (Customer) context.getBean("cust");
	System.out.println(c.getId()+c.getName());
	
}
}
