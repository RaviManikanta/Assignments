package com.yash.util.ass_array_oops;

class EmployeeDetails {  
	
	int emp_id, salary;  
	String name, address, department;  

	 
	public int getEmp_id() {  
		return emp_id;  
	}  
	public void setEmp_id(int emp_id) {  
		this.emp_id = emp_id;  
	}  
	public int getSalary() {  
		return salary;  
	}  
	public void setSalary(int salary) {  
		this.salary = salary;  
	}  
	public String getName() {  
		return name;  
	}  
	public void setName(String name) {  
		this.name = name;  
	}  
	public String getAddress() {  
		return address;  
	}  
	public void setAddress(String address) {  
		this.address = address;  
	}  
	public String getDepartment() {  
		return department;  
	}  
	public void setDepartment(String department) {  
		this.department = department;  
	}
	@Override  
	public String toString() {  
	    return Employee ["emp_id = "+emp_id+", salary = "+salary+", name = "+name+", address = " +address+ ",department = " +department];  
	    }  
	      
	}  