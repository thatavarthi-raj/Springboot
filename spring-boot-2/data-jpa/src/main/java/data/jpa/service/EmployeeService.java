package data.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import data.jpa.custom.repository.CustomEmployeeRespository;
import data.jpa.entity.EmployeeEntity;

@Service
public class EmployeeService {

	@Autowired
	private CustomEmployeeRespository employeeRepository;

	public List<EmployeeEntity> findAllEmployeesList() {
		List<EmployeeEntity> employeesList = employeeRepository.findAllEmployees();

		return employeesList;
	}

	public List<EmployeeEntity> findAllEmployeesByDeptId(Integer deptId) {
		List<EmployeeEntity> employeesList = employeeRepository.findAllEmployeesByDeptId(deptId);

		return employeesList;
	}
}