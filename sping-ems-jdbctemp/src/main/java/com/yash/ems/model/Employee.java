package com.yash.ems.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * pojo class creates table and its varibels
 * @author ravi.manikanta
 *
 */
@Entity
@Table(name="EMP_JDBCTEMP")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private double salary;
	private String designation;
	private String address;
	/**
	 * getter and setter methods of varibels
	 * @return
	 */
	public int getId() {
		return id;
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
	/**
	 * default constructor
	 */

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
/**
 * constructor using fields
 * @param id
 * @param name
 * @param salary
 * @param designation
 * @param address
 */
	public Employee(int id, String name, double salary, String designation, String address) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
		this.address = address;
	}
	/**
	 * to string method 
	 */

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation
			+ ", address=" + address + "]";
}
	
}
