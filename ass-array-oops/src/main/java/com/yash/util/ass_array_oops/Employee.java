package com.yash.util.ass_array_oops;

public class Employee{  
    //main() method start  
    public static void main(String args[]) {  
          
        //Creating object of EmployeeDetails class  
        EmployeeDetails emp = new EmployeeDetails();  
        //Setting values to the properties  
        emp.setEmp_id(101);  
        emp.setName("Ravi");  
        emp.setDepartment("IT");  
        emp.setSalary(25000);  
        emp.setAddress("New Delhi");  
      
          
        //Showing Employee details  
        System.out.println(emp);  
          
        //Getting salary using getter  
        int sal = emp.getSalary();  
        int increment = 0;  
        //Incrementing salary based on condition  
        if ((sal >=1000) && (sal <=1500))  
        {  
            //incrementing salary 2%  
            increment += (sal * 2)/100;  
            sal = sal+increment;  
              
            emp.setSalary(sal);  
            System.out.println("\n Salary is incremented \n");  
            System.out.println(emp);  
              
        }else if ((sal >=1500) && (sal <=20000)){  
            //incrementing salary 5%  
            increment += (sal * 5)/100;  
            sal = sal+increment;  
              
            emp.setSalary(sal);  
            System.out.println("\n Salary is incremented \n");  
            System.out.println(emp);  
        }else {  
            System.out.println("\n Salary is not incremented \n");  
            System.out.println(emp);  
        }         
    }  
}  
