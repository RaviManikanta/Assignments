package com.yash.collections.linkedlist;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class CustomerApp
{
  public static void main(String args[]) 
  {
	LinkedList<Customer> cu = new LinkedList<Customer>();
	cu.add(new Customer(1,"ravi",2.0));
	cu.add(new Customer(2,"anvesh",1.5));
	cu.add(new Customer(3,"sam",6.0));
	cu.add(new Customer(4,"rony",4.5));
	cu.add(new Customer(5,"jimmy",10.0));
	cu.add(new Customer(5,"jimmy",10.0));
	System.out.println(cu);
	
	//----------first and last ----------//
	  cu.addLast(new Customer(6,"messy",8.0));
	  System.out.println("first element in the list: "+cu.getFirst());
	  System.out.println("Last element in the list: "+cu.getLast());
	  
	//------------iterator method----------//
	  ListIterator<Customer> itr = cu.listIterator();
	  System.out.println("customers are: ");
	  while(itr.hasNext())
	  {
		  System.out.println(itr.next());
	  }
	  
	//--------remove from index------------//
	  cu.remove(1);
	  System.out.println(cu);
	  
	  
   //--------------sorting with id----------------//
	  Collections.sort(cu,new IdSort());
	  for(Customer c:cu) {
		  System.out.println(c);
	  }
	  
 //-----------------setmethod------------------//
	  cu.set(5, null);
	  System.out.println(cu);
	  
	  
	  
	//-------------compareto-----------//
	  @Override public int compareTo(Customer obj) {
		    return this.name.compareTo(obj.name);
		}
	  
  }	

}
