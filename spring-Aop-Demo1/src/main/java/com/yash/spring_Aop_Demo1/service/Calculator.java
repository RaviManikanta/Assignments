package com.yash.spring_Aop_Demo1.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Component
public class Calculator {
	int a=5,b=6;
	public void add(){
		System.out.println(a+b);
	}
	public void div() {
		System.out.println(a/b);
	}
	public void sub() {
		System.out.println(a-b);
	}
}

