package com.yash.ems.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.yash.ems.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long>{

}
