package data.jpa.mysql.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

import org.springframework.stereotype.Repository;

import data.jpa.mysql.entity.Employee;
import data.jpa.mysql.util.Constants;

@SuppressWarnings("unchecked")
@Repository
public class EmployeeRepositoryImpl implements CustomEmployeeRespository {

	@PersistenceContext
	private EntityManager entityManager;

	public List<Employee> findAllEmployees() {
		StoredProcedureQuery storedProcedureQuery = entityManager
				.createNamedStoredProcedureQuery(Constants.FIND_ALL_EMPLOYEES_NAME);

		return storedProcedureQuery.getResultList();
	}

	@Override
	public List<Employee> findAllEmployeesByDeptId(Integer deptId) {
		StoredProcedureQuery storedProcedureQuery = entityManager
				.createNamedStoredProcedureQuery(Constants.FIND_ALL_EMPLOYEES_BY_DEPT_ID_NAME);
		storedProcedureQuery.registerStoredProcedureParameter("deptId", Integer.class, ParameterMode.IN);
		storedProcedureQuery.setParameter("deptId", deptId);

		List<Employee> result = storedProcedureQuery.getResultList();

		return result;
	}

	@Override
	public Object findAllEmployeesAndDepartments() {
		StoredProcedureQuery storedProcedureQuery = entityManager
				.createNamedStoredProcedureQuery(Constants.FIND_ALL_EMPS_AND_DEPTS_NAME);

		Boolean hasResultSet = storedProcedureQuery.execute();

		Object employeesList = storedProcedureQuery.getResultList();
		/*List<DepartmentModel> departmentList = null;
		if (storedProcedureQuery.hasMoreResults()) {
			departmentList = storedProcedureQuery.getResultList();
		}
		
		Map<String, List<? extends Object>> result = new HashMap<>();
		result.put("employees", employeesList);
		result.put("departments", departmentList);*/

		return employeesList;
	}
}