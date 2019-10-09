package data.jpa.mysql.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

import org.springframework.stereotype.Repository;

import data.jpa.mysql.entity.Employee;
import data.jpa.mysql.util.Constants;

@Repository
public class EmployeeRepositoryImpl implements CustomEmployeeRespository {

	@PersistenceContext
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	public List<Employee> findAllEmployees() {
		StoredProcedureQuery storedProcedureQuery = entityManager
				.createNamedStoredProcedureQuery(Constants.FIND_ALL_EMPLOYEES);

		return storedProcedureQuery.getResultList();
	}
}