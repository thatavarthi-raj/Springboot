package data.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import data.jpa.entity.EmployeeEntity;

@Repository
public interface EmployeeEntityRepository extends JpaRepository<EmployeeEntity, Integer> {

	@Query(nativeQuery = true, value = "select * from emp e join dept d on e.deptno = d.deptno")
	List<Object[]> findEmployeeAndDept();
}