package com.yash.ass_collections_shoppingapp;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class ShoppingApp  
{
	public static void main(String args[]) throws NullPointerException
	{
		HashSet<Product> p = new HashSet<Product>();
		p.add(new Product(1,"laptop",65000));
		p.add(new Product(2,"Mobile",25000));
		p.add(new Product(3,"TV",45000));
		p.add(null);
		p.add(new Product(4,"Tab",37000));
		p.add(new Product(5,"Table",15000));
		p.add(new Product(6,"Camera",30000));
		
			
			p.add(null);        //hashset only supports one null value
			p.add(null);
	
		p.add(new Product(3,"TV",45000));//by using equals method can avoid duplicates
		p.add(new Product(3,"TV",45000));
		p.add(new Product(7,"Bottel",500));
		
		Iterator<Product> itr = p.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		//---------------------//
		System.out.println("Size of list: "+p.size()); //prints size of list
		//------------------------//
		
		HashSet<Product> p1= new HashSet<Product>();
		p1=(HashSet<Product>)p.clone();
		System.out.println("-------- cloneMethod----------");		
		Iterator<Product> itr1 = p1.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		//-----------------------//
		try {
			System.out.println("first element:");
		System.out.println("firstobj: "+p1.stream().findFirst().get());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}
}
