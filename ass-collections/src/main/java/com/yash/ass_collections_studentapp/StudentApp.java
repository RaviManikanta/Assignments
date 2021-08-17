package com.yash.ass_collections_studentapp;

import java.util.Iterator;
import java.util.Vector;


public class StudentApp
{
 public static void main(String  args[])
 {
	 Vector<Student> v = new Vector<Student>();
	 v.add(new Student(1,"luffy",8));
	 v.add(new Student(2,"nami",5));
	 v.add(new Student(3,"zoro",9));
	 v.add(new Student(4,"robin",10));
	 v.add(new Student(5,"sagi",8));
	 
	 Iterator<Student> itr = v.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	 
	 System.out.println("capacity:--"+v.capacity());
	 System.out.println("size:-- "+v.size());
	 System.out.println("verify element "+v.contains(6));
	 System.out.println(" element at 2 "+v.elementAt(2));
	 System.out.println("-----------------------------");
	 System.out.println(v.set(2, null));
	 Iterator<Student> itr1 = v.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
	 
	 
	
 }
}
