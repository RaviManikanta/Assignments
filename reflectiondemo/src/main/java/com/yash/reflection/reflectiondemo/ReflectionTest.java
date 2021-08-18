package com.yash.reflection.reflectiondemo;

//A simple Java program to demonstrate the use of reflection
import java.lang.reflect.Modifier;
import java.lang.reflect.Field;
import java.lang.reflect.Constructor;

public class ReflectionTest
{
	public static void main (String[] args) throws ClassNotFoundException
	{
		Class c =  Class.forName("Employee");
		System.out.println(c);
		
		System.out.println("super class:  "+c.getSuperclass());
		
		
	}

}
