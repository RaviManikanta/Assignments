package com.yash.collections.linkedlist;

import java.util.Comparator;


public class IdSort implements Comparator<Customer>
{

	@Override
	public int compare(Customer o1, Customer o2) 
	{
		if(o1.getId() < o2.getId()) 
		{
		return 1;
		}
		else
		return 0;
	}
  
}
