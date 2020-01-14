# Spring Boot 2 Data JPA

## Description
* Spring Boot 2 Data JPA

## Create project using maven command
```
mvn archetype:generate -DgroupId=data.jpa -DartifactId=data-jpa -Dversion=1.0 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```

## Convert maven to gradle project
```
gradle init --type pom
```

## Active Profiles
* **spring.profiles.active=mysql** in **application.properties** connects to MySQL DB
* **spring.profiles.active=h2** in **application.properties** connect to in memory H2 DB

## SQL Files
* [Create DB](https://github.com/avinashbabudonthu/sql/blob/master/mysql/create-db-and-user.sql)
* [Create tables scripts](https://github.com/avinashbabudonthu/sql/blob/master/mysql/practice-tables.sql)
* [Data scripts](https://github.com/avinashbabudonthu/sql/blob/master/mysql/insert-queries.sql)
* [Delete scripts](https://github.com/avinashbabudonthu/sql/blob/master/mysql/delete-queries.sql)
* [Drop scripts](https://github.com/avinashbabudonthu/sql/blob/master/mysql/drop-queries.sql)
* [Select queries](https://github.com/avinashbabudonthu/sql/blob/master/mysql/select-queries.sql)
* [Stored Procedures](https://github.com/avinashbabudonthu/sql/blob/master/mysql/stored-procedures.sql)
```
find_all_employees()
find_employee_by_dept_id(in dept_id_in int)
```

## Examples
* [Execute stored procedure - 0 in params, n out params](#execute-stored-procedure-returns-multiple-columns-and-return-model-list)
* [Execute stored procedure - 1 in param, n out params](#execute-stored-procedure-with-one-in-param-multiple-out-params)
* [Spring Data JPA Native Query Resultset Mapping](spring-data-jpa-native-query-resultset-mapping)

### Execute stored procedure returns multiple columns and return model list
* Create stored procedure **[find_all_employees](https://github.com/avinashbabudonthu/sql/blob/master/mysql/stored-procedures.sql)**
* Declare **javax.persistence.NamedStoredProcedureQueries** annotation on **Employee.java** and define stored procedure details
* Declare **javax.persistence.SqlResultSetMapping** annotation on **Employee.java** and define target resultset class name
* Define custom repository interface - **data.jpa.mysql.repository.CustomEmployeeRespository**
* Create implementation class - **data.jpa.mysql.repository.EmployeeRepositoryImpl**
* Inject **EntityManager** to **data.jpa.mysql.repository.EmployeeRepositoryImpl** using annotation **javax.persistence.PersistenceContext**
* Execute stored procedure - **data.jpa.mysql.repository.EmployeeRepositoryImpl.findAllEmployees()**

### Execute Stored Procedure With One In Param Multiple Out Params
* Create stored procedure **[find_employee_by_dept_id](https://github.com/avinashbabudonthu/sql/blob/master/mysql/stored-procedures.sql)**
* Declare **javax.persistence.NamedStoredProcedureQueries** annotation on **Employee.java** with name **Constants.FIND_ALL_EMPLOYEES_BY_DEPT_ID_NAME**
* Result set mapping with name **Constants.FIND_ALL_EMPLOYEES_BY_DEPT_ID_RESULT_SET_MAPPING**. This is used to return **List&lt;EmployeeModel&gt;**
* Refer API
```
/employees/dept/{id}
```
* API Method
```
EmployeeController.findAllEmployeesByDeptId(@PathVariable("id") Integer deptId)
```

### Spring Data JPA Native Query Resultset Mapping
* Write native query in Repository. Refer **findEmployeeAndDept()** method in [EmployeeEntityRepository](src/main/java/data/jpa/repository/EmployeeEntityRepository.java)
* Create an interface [EmployeeDepartmentEntity](src/main/java/data/jpa/entity/EmployeeDepartmentEntity.java)
* Declare getters in interface as per getter naming conventions of columns
* Execute query, we should get result set as proxy object of above interface

## Postman Collection
* [data-jpa.postman_collection.json](postman-collection/data-jpa.postman_collection.json)

## Materials
* [Spring data examples jpa](https://github.com/spring-projects/spring-data-examples/tree/master/jpa/jpa21)
### Pluralsight
* Getting Started with Spring Data JPA