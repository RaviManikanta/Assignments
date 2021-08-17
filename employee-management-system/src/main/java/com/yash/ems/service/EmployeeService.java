/**
 * Initializing  Arraylist of employee
 * class consits of Arraylist
 */
package com.yash.ems.service;

import java.util.ArrayList;

import com.yash.ems.model.Employee;

public class EmployeeService 
{

	public static ArrayList<Employee> e = new ArrayList<Employee>();
	static 
	{
		e.add(new Employee("Anvesh",101,"Hyd","999999849","Manager",30000));
		e.add(new Employee("Darmesh",104,"Indore","999998988","Traniee",30000));
		e.add(new Employee("Ravi",102,"Hyd","99990000","Traniee",35000));
		e.add(new Employee("Kushagra",105,"Indore","9999965656","Traniee",30000));	
		e.add(new Employee("Anuj",103,"Pune","99911111","Trainee",40000));	
	}

}

