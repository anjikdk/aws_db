package com.aws.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aws.example.entity.Employee;
import com.aws.example.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> getAllemployees()
	{
		return employeeRepository.findAll();
	}

	public Employee addEmployee(Employee emp) {
		return employeeRepository.save(emp);
	}
}
