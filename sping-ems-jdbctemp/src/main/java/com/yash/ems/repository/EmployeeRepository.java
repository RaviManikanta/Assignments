package com.yash.ems.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.yash.ems.model.Employee;

@Repository
public class EmployeeRepository {
	@Autowired
	JdbcTemplate template;
	/**
	 * getting all employees
	 * @return
	 */
	public List<Employee> getAllEmployee(){
		List<Employee> employees = template.query("select id,name,salary,designation,address from emp_jdbctemp",(result,rowNum)->new Employee(result.getInt("id"),result.getString("name"),result.getDouble("salary"),result.getString("designation"),result.getString("address")));
		return employees;
	}
	
	/**
	 * getting a specific employee by id
	 */
	public Employee findById(int id) {
		return template.queryForObject("SELECT * FROM emp_jdbctemp WHERE id=?", new BeanPropertyRowMapper<Employee>(Employee.class), id);
	}
	/**
	 * Adding an employee record into database
	 */
	public int addEmployee(Employee e) {
		
		return template.update("INSERT INTO emp_jdbctemp (id,name,salary,designation,address) VALUES (?,?,?,?,?)", new Object[] {e.getId(),e.getName(), e.getSalary(), e.getDesignation(),e.getAddress()});
	}
	
	/**
	 * update an employee record from database
	 */
	public int update(Employee e,int id) {
		return template.update("update emp_jdbctemp SET name=?,salary=?,designation=?,address=? WHERE id=?", new Object[] {e.getName(), e.getSalary(), e.getDesignation(),e.getAddress(),id});
	}
	/**
	 * delete an employee record from database
	 */

	public int deleteById(int id) {
		return template.update("DELETE FROM emp_jdbctemp WHERE id=?",id);
	}
	/**
	 * search employee by name
	 */
	public Employee getEmployeeByName(String name) {
		return template.queryForObject("SELECT * FROM emp_jdbctemp WHERE name=?", new BeanPropertyRowMapper<Employee>(Employee.class), name);
	}
}
