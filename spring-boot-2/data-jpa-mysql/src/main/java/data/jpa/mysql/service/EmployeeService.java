package data.jpa.mysql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import data.jpa.mysql.entity.Employee;
import data.jpa.mysql.repository.CustomEmployeeRespository;

@Service
public class EmployeeService {

	@Autowired
	private CustomEmployeeRespository employeeRepository;

	public List<Employee> findAllEmployeesList() {
		List<Employee> employeesList = employeeRepository.findAllEmployees();

		return employeesList;
	}
}
