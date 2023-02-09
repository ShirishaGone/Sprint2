package com.springwithangular.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springwithangular.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
