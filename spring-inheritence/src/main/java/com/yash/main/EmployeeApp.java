package com.yash.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.model.Employee;

public class EmployeeApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application_context.xml");
		 Employee e1=(Employee)context.getBean("e2");  
		    e1.show();
		    e1.disp();

	}

}
