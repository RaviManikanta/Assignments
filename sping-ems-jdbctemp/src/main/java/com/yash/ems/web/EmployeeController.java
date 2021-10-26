package com.yash.ems.web;

import com.yash.ems.model.Employee;
import com.yash.ems.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class EmployeeController {
    @Autowired
    EmployeeRepository repo;

    @RequestMapping("/getAllEmployees")
    @ResponseBody
    public List<Employee> getAllEmployees(){
        return repo.getAllEmployee();
    }



    @PostMapping("/addEmployee")
    public String addEmployee(@RequestBody Employee e) {
    	return repo.addEmployee(e)+"Employee record added";
    }
    
    @PutMapping("/updateEmployee/{id}")
  public String update(@RequestBody Employee e,@PathVariable int id)
  {
	  return repo.update(e, id)+"employee record updated";
  }
    @GetMapping("/getemployee/{id}")
	public Employee findById(@PathVariable int id) {
		return repo.findById(id);
	}
    
    @DeleteMapping("/deleteEmployee/{id}")
    public String deleteById(@PathVariable int id)
{
return repo.deleteById(id)+"Employee record deleted";    	
}
    
    @GetMapping("/getEmployee/{name}")
    public Employee getEmployeeById(@PathVariable String name) {
    	return repo.getEmployeeByName(name);
    }
}