package com.yash.model;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "id")
   private Long empId;

   @Column(name = "name")
   private String firstName;

   @Column(name = "salary")
   private Double salary;

   @Column(name = "designation")
   private String designation;
   
   @Column(name = "department")
   private String department;
   
   @Column(name = "address")
   private String address;

public Long getEmpId() {
	return empId;
}

public void setEmpId(Long empId) {
	this.empId = empId;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public Double getSalary() {
	return salary;
}

public void setSalary(Double salary) {
	this.salary = salary;
}

public String getDesignation() {
	return designation;
}

public void setDesignation(String designation) {
	this.designation = designation;
}

public String getDepartment() {
	return department;
}

public void setDepartment(String department) {
	this.department = department;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public Employee() {
	super();
	// TODO Auto-generated constructor stub
}

public Employee(Long empId, String firstName, Double salary, String designation, String department, String address) {
	super();
	this.empId = empId;
	this.firstName = firstName;
	this.salary = salary;
	this.designation = designation;
	this.department = department;
	this.address = address;
}

@Override
public String toString() {
	return "Employee [empId=" + empId + ", firstName=" + firstName + ", salary=" + salary + ", designation="
			+ designation + ", department=" + department + ", address=" + address + "]";
}
   
   
}