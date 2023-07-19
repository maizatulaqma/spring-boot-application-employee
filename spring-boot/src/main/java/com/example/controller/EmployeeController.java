package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;
import com.example.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired EmployeeService employeeService;
	
	@GetMapping("/id")
	public Employee getById(@RequestParam(value = "id", defaultValue = "1")int id) {
		return employeeService.getById(id);
	}
	
	@RequestMapping(value = "/name", method = RequestMethod.GET)
	public Employee getByName(@RequestParam(value = "name", defaultValue = "Mariam")String name) {
		return employeeService.getByName(name);
	}
	
	@PostMapping("/save")
	public boolean saveEmployee(@RequestBody(required = true)Employee employee) {
		return employeeService.save(employee);
	}
}
