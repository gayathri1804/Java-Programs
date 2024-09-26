package com.example.empcrudwithvaliadation.service;

import java.util.List;

import com.example.empcrudwithvaliadation.entity.Employee;
import com.example.empcrudwithvaliadation.exception.EmployeeNotFoundExcepion;

public interface EmployeeService {
	public List<Employee> findAll();
	
	public Employee findById(int empId) throws EmployeeNotFoundExcepion;
	
	public Employee save(Employee employee);
	
	public void deleteById(int empId) throws EmployeeNotFoundExcepion;
}







