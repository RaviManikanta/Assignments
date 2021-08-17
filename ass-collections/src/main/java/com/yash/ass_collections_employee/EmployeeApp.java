package com.yash.ass_collections_employee;

import java.util.HashMap;
import java.util.Set;

public class EmployeeApp 
{
	public static void main(String args[])
	{
        HashMap<Integer,Employee> e = new HashMap<Integer,Employee>();
        e.put(1, new Employee(1,"luffy",20000,"Trainee","Java"));
        e.put(2, new Employee(2,"nami",20000,"Trainee","Java"));
        e.put(3, new Employee(3,"robin",20000,"Trainee","Java"));
        e.put(4, new Employee(4,"zoro",20000,"Trainee","Java"));
        e.put(5, new Employee(5,"sangi",20000,"Trainee","Java"));
        
        Set<Integer> KeySet = e.keySet();
        for(int i : KeySet){
        	System.out.println(e.get(i));
        }
        System.out.println("total members in company "+e.size());
        System.out.println("empty or not:- "+e.isEmpty());       
        System.out.println("does key 2 exits or not: "+e.containsKey(2));
         System.out.println("search for employee  :- "+e.get(4));
        
	}
}
