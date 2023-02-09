package com.springwithangular.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springwithangular.entity.Employee;
import com.springwithangular.repository.EmployeeRepository;
import com.springwithangular.service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository  employeeRepository;
	@Override
	public Employee addEmployee(Employee employee) {
		
		return employeeRepository.save(employee);
	}
	@Override
	public List<Employee> showemployees() {
		
		return employeeRepository.findAll();
	}

	
	}


