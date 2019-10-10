package data.jpa.mysql.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import data.jpa.mysql.entity.Employee;
import data.jpa.mysql.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping(value = "/employees", produces = APPLICATION_JSON_VALUE)
	public List<Employee> findAllEmployeesList() {
		return employeeService.findAllEmployeesList();
	}

	@GetMapping(value = "/employees/dept/{id}", produces = APPLICATION_JSON_VALUE)
	public List<Employee> findAllEmployeesByDeptId(@PathVariable("id") Integer deptId) {
		return employeeService.findAllEmployeesByDeptId(deptId);
	}
}
