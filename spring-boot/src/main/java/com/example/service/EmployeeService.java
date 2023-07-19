package com.example.service;

import com.example.model.Employee;

public interface EmployeeService {
	Employee getById(int id);
	Employee getByName(String name);
	boolean save(Employee employee);
}
