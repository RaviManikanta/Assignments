package com.yash.RestDemos;

import java.util.Objects;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class EmployeeDetails
{
int emp_id;
String emp_name;
double salary;

@Override
public String toString() {
	return "EmployeeDetails [emp_id=" + emp_id + ", emp_name=" + emp_name + ", salary=" + salary + "]";
}
@Override
public int hashCode() {
	return Objects.hash(emp_id, emp_name, salary);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	EmployeeDetails other = (EmployeeDetails) obj;
	return emp_id == other.emp_id && Objects.equals(emp_name, other.emp_name)
			&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
}
public EmployeeDetails() {
	super();
	// TODO Auto-generated constructor stub
}
public int getEmp_id() {
	return emp_id;
}
public void setEmp_id(int emp_id) {
	this.emp_id = emp_id;
}
public String getEmp_name() {
	return emp_name;
}
public void setEmp_name(String emp_name) {
	this.emp_name = emp_name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
}
