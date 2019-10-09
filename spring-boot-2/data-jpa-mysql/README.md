# Spring Boot 2 Data JPA with MySQL database

## Description
* Spring Boot 2 Data JPA with MySQL database

## Versions
* spring boot version 2.1.8.RELEASE
* Maven version 3.6.2
* MySql version 5.7.7

## Create project using maven command
```
mvn archetype:generate -DgroupId=data.jpa.mysql -DartifactId=data-jpa-mysql -Dversion=1.0 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```

## Convert maven to gradle project
```
gradle init --type pom
```

## SQL Files
* Create tables scripts - **db/create-tables.sql**
* Data scripts - **db/data.sql**
* Delete scripts - **db/delete.sql**
* Drop scripts - **db/drop-tables.sql**
* Select queries - **db/select.sql**
* Stored Procedures - **db/stored-procedures.sql**

## Entities
* Employee
* Department
* SalaryGrade

## Examples
* [Execute stored procedure returns multiple columns and return model list - 0 in params, n out params](#execute-stored-procedure-returns-multiple-columns-and-return-model-list)

### Execute stored procedure returns multiple columns and return model list
* Create stored procedure **find_all_employees** - Refer **db/stored-procedures.sql**
* Declare **javax.persistence.NamedStoredProcedureQueries** annotation on **Employee.java** and define stored procedure details
* Declare **javax.persistence.SqlResultSetMapping** annotation on **Employee.java** and define target resultset class name
* Define custom repository interface - **data.jpa.mysql.repository.CustomEmployeeRespository**
* Create implementation class - **data.jpa.mysql.repository.EmployeeRepositoryImpl**
* Inject **EntityManager** to **data.jpa.mysql.repository.EmployeeRepositoryImpl** using annotation **javax.persistence.PersistenceContext**
* Execute stored procedure - **data.jpa.mysql.repository.EmployeeRepositoryImpl.findAllEmployees()**

## References
* [Spring data examples jpa](https://github.com/spring-projects/spring-data-examples/tree/master/jpa/jpa21)