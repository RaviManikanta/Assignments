package com.yash.streams;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class EmployeeApp {

	public static void main(String[] args) {
		ArrayList<Employee> a= new ArrayList<Employee>();
		a.add(new Employee(1,"luffy",2000));
		a.add(new Employee(2,"nami",5000));
		a.add(new Employee(3,"zoro",3000));
		a.add(new Employee(1,"sangi",4000));
		a.add(new Employee(1,"robin",9000));
		System.out.println(a);
	
//--------------------------------------------------------//		
		ArrayList<Double> employeeSalary=(ArrayList<Double>) a.stream()
				.filter(s->s.sal==5000)
				.map(s->s.sal)				
				.collect(Collectors.toList());
		System.out.println(employeeSalary);	

//-------------------------------------------------------//		
		      a.stream()  
         .filter(s -> s.sal == 3000)  
         .forEach(s -> System.out.println("name: "+s.name+",id: "+s.id)); 
		 
//---------------------------------------------------------//
		   long count = a.stream() 
                  .filter(s->s.sal<5000)                  
                  .count(); 		   
      System.out.println(count);  
  
//-----------------------------------------------------------//

	}

}
