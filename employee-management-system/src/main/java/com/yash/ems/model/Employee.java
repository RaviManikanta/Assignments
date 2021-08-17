/**
 * model class performs variable initialization
 * class contains --> to string  method
 *                -->constructor for fields
 *                -->equals method
 *                -->getter and setter methods
 */

package com.yash.ems.model;

import java.util.Objects;

public class Employee
{

	String name;
	int id;
	String location;
	String num;
	String desegnation;
	double salary;
	
	
	
	public Employee(String name, int id, String location, String num, String desegnation, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.location = location;
		this.num = num;
		this.desegnation = desegnation;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", location=" + location + ", num=" + num + ", desegnation="
				+ desegnation + ", salary=" + salary + "]";
		
		
		
		
	}
	@Override
	public int hashCode() {
		return Objects.hash(desegnation, id, location, name, num, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(desegnation, other.desegnation) && id == other.id
				&& Objects.equals(location, other.location) && Objects.equals(name, other.name)
				&& Objects.equals(num, other.num)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getDesegnation() {
		return desegnation;
	}
	public void setDesegnation(String desegnation) {
		this.desegnation = desegnation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}  


}
