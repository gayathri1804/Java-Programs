package com.example.empcrudwithvaliadation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.empcrudwithvaliadation.entity.Employee;
import com.example.empcrudwithvaliadation.exception.EmployeeNotFoundExcepion;
import com.example.empcrudwithvaliadation.service.EmployeeService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	@GetMapping("/employees")
	public List<Employee> findAll(){
		return employeeService.findAll();
	}
	
	@GetMapping("employees/{employeeId}")
	public Employee getById(@PathVariable int employeeId) throws EmployeeNotFoundExcepion{
		Employee emp = employeeService.findById(employeeId);
		return emp;
	}
	
	@PostMapping("/employees")
	public ResponseEntity<Employee> addEmployee(@Valid @RequestBody Employee employee) {
		employee.setEmpId(0);
		Employee createdEmployee = employeeService.save(employee);
		return ResponseEntity.status(HttpStatus.CREATED).body(createdEmployee);

	}
	
	@PutMapping("/employees")
	public ResponseEntity<Employee> updateEmployee(@Valid @RequestBody Employee employee){
		Employee updateEmployee = employeeService.save(employee);
		return ResponseEntity.status(HttpStatus.CREATED).body(updateEmployee);
	}
	
	@DeleteMapping("/employees/{employeeId}")
	public String deleteEmployee(@PathVariable int employeeId) throws EmployeeNotFoundExcepion{
		employeeService.deleteById(employeeId);
		return "Deleted employee id: " +employeeId; 
	}
}
