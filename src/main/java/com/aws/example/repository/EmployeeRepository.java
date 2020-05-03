package com.aws.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aws.example.entity.Employee;

@Repository
public interface EmployeeRepository  extends JpaRepository<Employee, Integer>
{
	
}
