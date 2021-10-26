package com.yash.hibdelete;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Emp_table")
public class Employee {
	@Id  
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="EMP_ID")
	int id;
	@Column(name="EMP_NAME")
	String name;
	@Column(name="EMP_SALARY")
	double salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
}
