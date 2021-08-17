/**
 * Performing required operations to ArrayList
 * using java8 created various methods performs various operations using Stream Api
 */
package com.yash.ems.service_implementation;
import java.util.*;
import java.util.stream.*;

import com.yash.ems.service.EmployeeService;

public class EmployeeServiceImp 
{
	EmployeeService es =new EmployeeService();

	//gets arraylist
	public void getEmployeeList()
	{
		for(int i = 0; i < es.e.size(); i++) {
			System.out.println(es.e.get(i));
		}
	}


	//Performs sorting by Id
	public void getEmpSortId()
	{
		System.out.println(	es.e.stream()
				.sorted((o1, o2) -> {
					if(o1.getId() == o2.getId())
						return o1.getName().compareTo(o2.getName());
					else if(o1.getId() > o2.getId())
						return 1;
					else return -1;})
				.collect(Collectors.toList()));
	}

	//Perform sorting by salary
	public void getEmpSortSal()
	{
		System.out.println(	es.e.stream()
				.sorted((o1, o2) -> {
					if(o1.getSalary() == o2.getSalary())
						return o1.getName().compareTo(o2.getName());
					else if(o1.getSalary() > o2.getSalary())
						return 1;
					else return -1;
				})
				.collect(Collectors.toList()));

	}


}
