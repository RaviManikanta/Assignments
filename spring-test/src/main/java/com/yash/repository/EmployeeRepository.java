package com.yash.repository;

import org.springframework.data.repository.CrudRepository;

import com.yash.model.Employee;



public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

	public Employee findByName(String name);
	//save
	//findall

}
