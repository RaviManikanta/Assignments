package com.yash.model;

import com.yash.interfaces.Display;

public class Employee implements Display
{
	private int id;
private String name;
private Address address;
public Employee(int id, String name, Address address) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
}
public Employee(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}

@Override
public void disp() {
	System.out.println("-----disp-----");
	System.out.println(id+" "+name+" "+address);
	
}
@Override
public void show() { 
	System.out.println("-----show------");
	    System.out.println(id+" "+name);  
	    System.out.println(address);  
	}
	
}

