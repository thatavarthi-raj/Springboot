package data.jpa.mysql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import data.jpa.mysql.entity.Employee;
import data.jpa.mysql.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/employees")
	public List<Employee> findAllEmployeesList() {
		return employeeService.findAllEmployeesList();
	}
}
