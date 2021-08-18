package com.yash.reflection.reflectiondemo;

import java.io.Serializable;


public class Employee implements Serializable,Cloneable
{
	private int id;
	private String name;
	private String address;
	public Employee() {
		super();
	}
	public Employee(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public void add() {

	}
	public void searchEmployee(int id) {

	}
}
