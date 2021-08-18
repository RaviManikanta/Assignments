package com.yash.functionalinterface;

@FunctionalInterface
interface Product 
{
	//public void date();
	public void id(int id);
	default void price() 
	{
		System.out.println("this is default method");
	}
	static void name(String name) 
	{
		System.out.println("product name: "+name);
	}
}

public class FunctionalInterfaceDemo implements Product {

	public static void main(String[] args) {
		FunctionalInterfaceDemo f = new FunctionalInterfaceDemo();
		f.id(5);
		f.price();
		Product.name("choclates");
	}
	
	public void price()
	{
		System.out.println("Default override");
	}
	@Override
	public void id(int id) {
		System.out.println("product id is: "+id);
		
	}
	
}
