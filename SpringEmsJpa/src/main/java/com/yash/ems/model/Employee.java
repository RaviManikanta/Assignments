package com.yash.ems.model;

import javax.persistence.*;

@Entity
@Table(name="EMP_JPA")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private long id;
private String name;
private double salary;
private String designation;
private String address;

public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

}
