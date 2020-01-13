package data.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import data.jpa.custom.repository.CustomEmployeeRespository;
import data.jpa.entity.EmployeeDepartmentEntity;
import data.jpa.entity.EmployeeEntity;
import data.jpa.repository.EmployeeEntityRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
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

	public List<EmployeeDepartmentEntity> findEmployeeAndDept() {
		List<EmployeeDepartmentEntity> result = employeeEntityRepository.findEmployeeAndDept();

		result.stream().forEach(empDept -> {
			log.info("empno={}, ename={}, deptno={}, dname={}, loc={}, job={}, sal={}", empDept.getEmpno(),
					empDept.getEname(), empDept.getDeptno(), empDept.getDname(), empDept.getLoc(), empDept.getJob(),
					empDept.getSal());
		});
		return result;
	}
}