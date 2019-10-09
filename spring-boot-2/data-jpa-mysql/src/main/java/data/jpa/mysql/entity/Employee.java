package data.jpa.mysql.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;

import data.jpa.mysql.model.EmployeeModel;
import data.jpa.mysql.util.Constants;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "EMP")
@SqlResultSetMapping(name = "findAllEmployees", classes = @ConstructorResult(targetClass = EmployeeModel.class, columns = {
		@ColumnResult(name = "empno", type = Integer.class), @ColumnResult(name = "ename", type = String.class),
		@ColumnResult(name = "job", type = String.class), @ColumnResult(name = "sal", type = Long.class),
		@ColumnResult(name = "comm", type = Long.class), @ColumnResult(name = "mgr", type = Integer.class),
		@ColumnResult(name = "hiredate", type = Date.class), @ColumnResult(name = "deptno", type = Integer.class),
		@ColumnResult(name = "dname", type = String.class), @ColumnResult(name = "loc", type = String.class) }))
@NamedStoredProcedureQueries({
		@NamedStoredProcedureQuery(name = Constants.FIND_ALL_EMPLOYEES, procedureName = "find_all_employees", resultSetMappings = {
				"findAllEmployees" }) })
public class Employee {

	@Id
	@Column(name = "EMPNO")
	private Integer id;

	@Column(name = "ENAME")
	private String name;

	@Column(name = "JOB")
	private String job;

	@Column(name = "SAL")
	private Long salary;

	@Column(name = "COMM")
	private Long comm;

	@Column(name = "MGR")
	private Integer manager;

	@Column(name = "HIREDATE")
	private Date hiredate;

	@Column(name = "ACTIVE")
	private Boolean active;

	@ManyToOne
	@JoinColumn(name = "DEPTNO", referencedColumnName = "DEPTNO")
	private Department department;

}
