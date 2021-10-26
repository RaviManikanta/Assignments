package com.yash.RestDemos;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("emp")
public class EmployeeResource 
{
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public EmployeeDetails getEmployee() {
		System.out.println("getemployee started");
		EmployeeDetails emp = new EmployeeDetails();
		emp.setEmp_id(101);
		emp.setEmp_name("Ravi");
		emp.setSalary(24000);
		
		return emp;
	}
}
