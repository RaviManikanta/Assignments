/**
 * main class
 * 
 */
package com.yash.ems.main;

import java.util.Scanner;
import com.yash.ems.exceptions.EmsExceptions;
import com.yash.ems.service_implementation.EmployeeServiceImp;

public class EmployeeApp 
{
	public static void main(String[] args) throws Exception {

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcom to EMS App ");
		EmployeeServiceImp esi = new EmployeeServiceImp();
		EmsExceptions ese = new EmsExceptions();

		while(true){
		    
			System.out.println("\n \n SELECT YOUR OPTION : ");
			System.out.println("To get  Employee List, Enter 1 ");
			System.out.println("To search Employee by Location,Enter 2 ");
			System.out.println("To search by Employee Name, Enter 3");
			System.out.println("To sort by Employee Id , Enter 4");
			System.out.println("To sort by Employee salary, Enter 5");
			System.out.println("To Exit, Enter 9");

			System.out.println();
			System.out.println("Enter your choice::");
			int choice = scan.nextInt();

			switch(choice)
			{
			case 1: 
				System.out.println("LIST OF EMPLOYEES");
				esi.getEmployeeList();
				break;
			case 2: 
				System.out.println("SEARCHING BY LOCATION ");
			    esi.getEmployeeLoc();
			    break;
			case 3:
				System.out.println("SEARCHING BY NAME");
			    esi.getEmployeeName();
			    break;
			case 4:
				System.out.println("SORTING BY ID");
			    esi.getEmpSortId();
			    break;
			case 5:
				System.out.println("SORTING BR SALARY");
			    esi.getEmpSortSal();
		    	break;
			case 9:
				System.out.println("----Thanks for using EMS App----");
			    System.exit(0);
			    break;
			default:
				System.out.println("Incorrect input!!! Please re-enter choice from our menu");
			}
		}   
	}
}
