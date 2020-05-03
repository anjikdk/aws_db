package com.aws.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aws.example.entity.Employee;
import com.aws.example.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/emps")
	public List<Employee> getAllEmployees()
	{
		return employeeService.getAllemployees();
	}
	
	@PostMapping("/emp")
	public Employee addEmployee(@RequestBody Employee emp)
	{
		return employeeService.addEmployee(emp);
	}
}
