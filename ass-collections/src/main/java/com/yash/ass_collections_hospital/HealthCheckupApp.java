package com.yash.ass_collections_hospital;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class HealthCheckupApp {

	public static void main(String[] args) {
		
		Set<Patient> s = new LinkedHashSet<Patient>();
		s.add(new Patient(1,"anvesh",23));
		s.add(new Patient(2,"sam",25));
		s.add(new Patient(3,"rony",20));
		s.add(new Patient(4,"antony",24));
		s.add(new Patient(5,"nami",26));
		s.add(new Patient(6,"zoro",25));
		s.add(new Patient(7,"luffy",27));
		
		
		
		Iterator<Patient> itr1 = s.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		System.out.println("----------------------------");
		
		//=========================//
		
		LinkedList<Patient> ll = new LinkedList<Patient>(s);	
		System.out.println("First patient in the list ::-- "+ll.getFirst());
		System.out.println("last patient in the list ::-- "+ll.getLast());

		System.out.println("----------------------------");
		
		//=========================//
		System.out.println("getting only 5 patient list");
		for(int num=0; num<5; num++)
	      {
	    	  System.out.println(ll.get(num));
	      }

	}
}

