package com.yash.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.yash.Dao.EmployeeDao;
import com.yash.model.Employee;


@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeDao employeedao;

    @GetMapping("/list")
    public String listEmployee(Model theModel) {
        List <Employee> theEmployee = employeedao.getEmployee();
        theModel.addAttribute("employee", theEmployee);
        return "employee-list";
    }

}