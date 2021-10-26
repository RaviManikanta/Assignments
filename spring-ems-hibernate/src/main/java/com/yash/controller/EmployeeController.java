package com.yash.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.yash.Dao.EmployeeDao;
import com.yash.model.Employee;

@Controller
@RequestMapping(value="/employee")
public class EmployeeController {
	@Autowired
	private EmployeeDao employeedao;
	

	@RequestMapping(value="/add", method=RequestMethod.GET)
	public ModelAndView addEmployeePage() {
		ModelAndView modelAndView = new ModelAndView("add-employee-form");
		modelAndView.addObject("employee", new Employee());
		return modelAndView;
	}
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public ModelAndView addingEmployee(@ModelAttribute Employee employee) {
		
		ModelAndView modelAndView = new ModelAndView("home");
		employeedao.addEmployee(employee);
		
		String message = "record was successfully added.";
		modelAndView.addObject("message", message);
		
		return modelAndView;
	}
	
	@RequestMapping(value="/list")
	public ModelAndView listOfEmployee() {
		ModelAndView modelAndView = new ModelAndView("list-of-employee");
		
		List<Employee> employee = employeedao.getEmployee();
		modelAndView.addObject("employee", employee);
		
		return modelAndView;
	}
	
	@RequestMapping(value="/edit/{id}", method=RequestMethod.GET)
	public ModelAndView editTeamPage(@PathVariable Integer id) {
		ModelAndView modelAndView = new ModelAndView("edit-employee-form");
		Employee employee = employeedao.getEmployee(id);
		modelAndView.addObject("employee",employee);
		return modelAndView;
	}
	
	
	@RequestMapping(value="/edit/{id}", method=RequestMethod.POST)
	public ModelAndView edditingEmployee(@ModelAttribute Employee employee, @PathVariable Integer id) {
		
		ModelAndView modelAndView = new ModelAndView("home");
		
		employeedao.updateEmployee(employee);
		
		String message = "Record was successfully edited.";
		modelAndView.addObject("message", message);
		
		return modelAndView;
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
	public ModelAndView deleteEmployee(@PathVariable Integer id) {
		ModelAndView modelAndView = new ModelAndView("home");
		employeedao.deleteEmployee(id);
		String message = "Record was successfully deleted.";
		modelAndView.addObject("message", message);
		return modelAndView;
	}

}
