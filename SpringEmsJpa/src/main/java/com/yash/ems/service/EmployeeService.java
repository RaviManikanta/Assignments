package com.yash.ems.service;

import java.util.List;

import com.yash.ems.model.Employee;

public interface EmployeeService {
public List<Employee> getAllEmployee();
public Employee getEmployeeById(Long id);
public boolean saveEmployee(Employee employee);
public boolean deleteEmployeeById(Long id);
}
