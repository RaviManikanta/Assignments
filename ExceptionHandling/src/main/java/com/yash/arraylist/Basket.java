package com.yash.arraylist;

import java.util.*;

/**
 * Creating a program basket which contains fruits and veges
 * performing different arraylist operations on it
 * @author USER-PC
 *
 */
public class Basket
{
	public static void main (String args[])
	{
		ArrayList<String> list=new ArrayList<String>();   //creating arraylist
		list.add("Mango");                                //adding objects to list
		list.add("Apple");
		list.add("Cabbage");
		list.add("Chilli");
		list.add("Potato");
		list.add("Potato");
		
		System.out.println(list);

		list.remove(2);                //removes object which was stored in array 
		System.out.println(list);

		list.add(2, "Carrot");         //adds the specified element at the specified position in thislist
		System.out.println(list);  

		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Ginger");
		list2.add("Onion");
		list.addAll(list2);            //adds all elements in list2 to list 
		

		System.out.println(list.size());//prints the size of an arraylist
		System.out.println(list2);
		list2.clear();                  //clear the elements in array
		System.out.println(list2);
		Collections.sort(list);        //sorts the specified list into ascending order
		System.out.println(list);


	}
}
