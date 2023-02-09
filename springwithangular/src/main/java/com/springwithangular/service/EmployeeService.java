package com.springwithangular.service;

import java.util.List;

import com.springwithangular.entity.Employee;

public interface EmployeeService {
Employee addEmployee(Employee employee);
List<Employee> showemployees();
}
