package com.yash.Dao;

import java.util.List;

import com.yash.model.Employee;

public interface EmployeeDao {
	public void addEmployee(Employee employee);
	public void updateEmployee(Employee employee);
	public Employee getEmployee(int id);
	public void deleteEmployee(int id);
	public List<Employee> getEmployee();


}
