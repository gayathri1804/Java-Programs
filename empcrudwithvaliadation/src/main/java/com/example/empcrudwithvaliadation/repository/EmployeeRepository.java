package com.example.empcrudwithvaliadation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.empcrudwithvaliadation.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
