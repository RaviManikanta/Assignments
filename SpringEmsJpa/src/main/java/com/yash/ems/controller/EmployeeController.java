package com.yash.ems.controller;


import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.yash.ems.model.Employee;
import com.yash.ems.service.EmployeeService;
@Controller
public class EmployeeController {
	private EmployeeService employeeService;

	public EmployeeController() {

	}

	@Autowired
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	@RequestMapping(value = { "/", "/home" }, method = RequestMethod.GET)
	public ModelAndView hello(HttpServletResponse response) throws IOException {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		return mv;
	}
	// Get All Users
		@RequestMapping(value = "/allEmployees", method = RequestMethod.POST)
		public ModelAndView displayAllEmployee() {
			
			ModelAndView mv = new ModelAndView();
			List<Employee> empList = employeeService.getAllEmployee();
			mv.addObject("empList", empList);
			mv.setViewName("allEmployees");
			return mv;
		}
	
		//to add employee record in list
		@RequestMapping(value = "/addEmployee", method = RequestMethod.GET)
		public ModelAndView displayNewEmplyeeForm() {
			ModelAndView mv = new ModelAndView("addEmployee");
			mv.addObject("headerMessage", "Add Employee Details");
			mv.addObject("employee", new Employee());
			return mv;
		}
		
		@RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
		public ModelAndView saveNewEmployee(@ModelAttribute Employee employee, BindingResult result) {
			ModelAndView mv = new ModelAndView("redirect:/home");

			if (result.hasErrors()) {
				return new ModelAndView("error");
			}
			boolean isAdded =employeeService.saveEmployee(employee);
			if (isAdded) {
				mv.addObject("message", "New Employee Record added successfully");
			} else {
				return new ModelAndView("error");
			}

			return mv;
		}

		@RequestMapping(value = "/editEmployee/{id}", method = RequestMethod.GET)
		public ModelAndView displayEditEmployeeForm(@PathVariable Long id) {
			ModelAndView mv = new ModelAndView("/editEmployee");
			Employee employee = employeeService.getEmployeeById(id);
			mv.addObject("headerMessage", "Edit Employee Details");
			mv.addObject("employee", employee);
			return mv;
		}

		@RequestMapping(value = "/editEmployee/{id}", method = RequestMethod.POST)
		public ModelAndView saveEditedEmployee(@ModelAttribute Employee employee, BindingResult result) {
			ModelAndView mv = new ModelAndView("redirect:/home");

			if (result.hasErrors()) {
				System.out.println(result.toString());
				return new ModelAndView("error");
			}
			boolean isSaved = employeeService.saveEmployee(employee);
			if (!isSaved) {

				return new ModelAndView("error");
			}

			return mv;
		}

		@RequestMapping(value = "/deleteEmployee/{id}", method = RequestMethod.GET)
		public ModelAndView deleteEmployeeById(@PathVariable Long id) {
			boolean isDeleted = employeeService.deleteEmployeeById(id);
			System.out.println("Employee deletion respone: " + isDeleted);
			ModelAndView mv = new ModelAndView("redirect:/home");
			return mv;

		}

	}

