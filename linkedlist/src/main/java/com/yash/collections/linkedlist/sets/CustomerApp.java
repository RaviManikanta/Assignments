package com.yash.collections.linkedlist.sets;

import java.util.Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;


public class CustomerApp
{
	public static void main(String args[]) {
		HashSet<Customer> cu = new HashSet<Customer>();
		cu.add(new Customer(1,"ravi",2.0));
		cu.add(new Customer(2,"anvesh",1.5));
		cu.add(new Customer(3,"sam",6.0));
		cu.add(new Customer(4,"rony",4.5));
		cu.add(new Customer(5,"jimmy",10.0));
		cu.add(new Customer(5,"jimmy",10.0));
		//-------------iteration--------------//
		Iterator<Customer> itr = cu.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

		//------ Sorting HashSet using TreeSet----------//		
		//TreeSet<Customer> treeSet = new TreeSet<Customer>(cu);
	//	System.out.println(treeSet);
		
	
		
		
	}

}
