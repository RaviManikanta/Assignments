package com.yash.DaoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yash.Dao.EmployeeDao;
import com.yash.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	
	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public void addEmployee(Employee employee) {
		getCurrentSession().save(employee);
		
	}

	@Override
	public void updateEmployee(Employee employee) {

		Employee employeeToUpdate = getEmployee(employee.getId());
		employeeToUpdate.setName(employee.getName());
		employeeToUpdate.setDepartment(employee.getDepartment());
		employeeToUpdate.setDesignation(employee.getDesignation());
		employeeToUpdate.setAddress(employee.getAddress());
		
		getCurrentSession().update(employeeToUpdate);
	}

	@Override
	public Employee getEmployee(int id) {
		Employee employee = (Employee) getCurrentSession().get(Employee.class,id);	
		return employee;
	}

	@Override
	public void deleteEmployee(int id) {
		Employee empdel = getEmployee(id);
		if(empdel != null)
			getCurrentSession().delete(empdel);
		
	}

	@SuppressWarnings("unchecked")
	public List<Employee> getEmployee() {
		return getCurrentSession().createQuery(" from employeehib").list();
	}

}
