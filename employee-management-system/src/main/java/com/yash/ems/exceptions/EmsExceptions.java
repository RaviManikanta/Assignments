package com.yash.ems.exceptions;
/**
 * This is exception class
 * used to handle exceptions
 */

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.yash.ems.model.Employee;
import com.yash.ems.service.EmployeeService;

public class EmsExceptions 
{
	EmployeeService es =new EmployeeService();



	//Performs searching by location
	public void getEmployeeLoc()
	{		

		System.out.println("enter location: ");
		Scanner sc = new Scanner(System.in);		 
		String loca = sc.nextLine();

		List<Employee> list = 
				es.e.stream()
				.filter(loc->loc.getLocation()
						.equals(loca))
				.collect(Collectors.toList());	

		if(list.size()==0) {
			try {	
				throw new Exception();
			}
			catch(Exception e)
			{
				System.out.println("entered location not found "+e);
			}
		}
		else System.out.println(list);
	}


	//Performs searching by name
	public void getEmployeeName()
	
	{	
		System.out.println("enter Name: ");
		Scanner sc = new Scanner(System.in);		 
		String name = sc.nextLine();
		List<Employee> list1 = 
		         es.e.stream()
				.filter(n->n.getName()
						.equals(name))
				.collect(Collectors.toList());
	
	if(list1.size()==0) {
		try {
			throw new Exception();			
		}
		catch(Exception e)
		{
			System.out.println("entered name not found " +e);
			}		
	}
	else System.out.println(list1);
	}
}
