package data.jpa.mysql.repository;

import java.util.List;

import data.jpa.mysql.entity.Employee;

public interface CustomEmployeeRespository {

	List<Employee> findAllEmployees();
}
