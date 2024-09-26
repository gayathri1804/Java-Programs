package com.example.empcrudwithvaliadation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.empcrudwithvaliadation.entity.Employee;
import com.example.empcrudwithvaliadation.exception.EmployeeNotFoundExcepion;
import com.example.empcrudwithvaliadation.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRpository) {
		super();
		this.employeeRepository = employeeRepository;
		
		}
	@Override 
	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}
	
	@Override
	public Employee findById(int empId) throws EmployeeNotFoundExcepion {
		Optional<Employee> result = employeeRepository.findById(empId);
		Employee employee;
		if(result.isPresent()) {
			employee = result.get();
		}
		else {
			throw new EmployeeNotFoundExcepion("Employee id not found:" +empId);
		}
		return employee;
	}
	
	@Override
	public Employee save(Employee employee) {
		return employeeRepository.save(employee);
	}
	@Override
	public void deleteById(int empId) throws EmployeeNotFoundExcepion {
		// TODO Auto-generated method stub
		if (employeeRepository.existsById(empId)) {
			employeeRepository.deleteById(empId);
		} else {
			throw new EmployeeNotFoundExcepion("Employee with ID "+ empId + "not found");
		}
	}
}
