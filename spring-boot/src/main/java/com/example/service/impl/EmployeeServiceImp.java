package com.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Employee;
import com.example.repository.EmployeeRepository;
import com.example.service.EmployeeService;

@Service
public class EmployeeServiceImp implements EmployeeService {

	@Autowired EmployeeRepository employeeRepository;

	@Override
	public Employee getById(int id) {
		Employee e = employeeRepository.findById(id).orElse(null);
		return e;
	}

	@Override
	public Employee getByName(String name) {
		Employee e = employeeRepository.findByName(name);
		return e;
	}

	@Override
	public boolean save(Employee employee) {
		employeeRepository.save(employee);
		return true;
	}

}
