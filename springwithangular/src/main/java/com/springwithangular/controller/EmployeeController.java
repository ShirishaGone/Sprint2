package com.springwithangular.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springwithangular.entity.Employee;
import com.springwithangular.service.EmployeeService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class EmployeeController {
	@Autowired
    private EmployeeService employeeService;
	@PostMapping("/addemployees")
	void saveEmployee(@RequestBody Employee employee)
	{
		employeeService.addEmployee(employee);
	}
	@GetMapping("/getemployees")
	public List<Employee> getmployees()
	{
		return employeeService.showemployees();
	}
}
