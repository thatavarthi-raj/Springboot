package data.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import data.jpa.custom.repository.CustomEmployeeRespository;
import data.jpa.entity.EmployeeEntity;
import data.jpa.repository.EmployeeEntityRepository;

@Service
public class EmployeeService {

	@Autowired
	private CustomEmployeeRespository customEmployeeRepository;

	@Autowired
	private EmployeeEntityRepository employeeEntityRepository;

	public List<EmployeeEntity> findAllEmployeesList() {
		List<EmployeeEntity> employeesList = customEmployeeRepository.findAllEmployees();

		return employeesList;
	}

	public List<EmployeeEntity> findAllEmployeesByDeptId(Integer deptId) {
		List<EmployeeEntity> employeesList = customEmployeeRepository.findAllEmployeesByDeptId(deptId);
		return employeesList;
	}

	public String findEmployeeAndDept() {
		List<Object[]> result = employeeEntityRepository.findEmployeeAndDept();

		return "success";
	}
}