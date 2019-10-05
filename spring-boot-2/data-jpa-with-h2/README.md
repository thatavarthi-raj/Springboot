# Spring Boot 2 project integration Data JPA with H2

## Versions
* spring boot version **2.1.8.RELEASE**
* Maven version **3.6.2**
* Gradle version **5.0**

## Create project using maven
```
mvn archetype:generate -DgroupId=spring.boot.data.jpa.h2 -DartifactId=data-jpa-with-h2 -Dversion=1.0 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```

## Add gradle
```
gradle init --type pom
```

## Dependencies
* spring-boot-starter-parent
* spring-boot-starter-web
* spring-boot-starter-test
* spring-boot-starter-data-jpa
* com.h2database:h2
* org.projectlombok:lombok

## Default H2 database details if we do not give any in application.properties
```
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.h2.console.enabled=false
```

## Following properties are overridden in application.properties
```
spring.datasource.url=jdbc:h2:mem:spring-boot-data-jpa-h2
spring.h2.console.enabled=true
spring.h2.console.path=/h2
```

## To use file based H2 DB
* spring.datasource.url=jdbc:h2:file:{path}/{db-name};MV_STORE=FALSE
* spring.datasource.url=jdbc:h2:file:E:/practice-projects/spring-boot-1/data-jpa-h2/db;MV_STORE=FALSE

## Classes
* Employee
* EmployeeRepository
* AppController
* App

## Steps to execute from IDE
* Import project to any IDE
* Execute App.java
* Should see application up and running
* In console we can see insert and select queries because we using **CommandLineRunner**

## Steps to execute using maven
* Install maven in local
* Navigate to project in terminal
* Run command **mvn clean spring-boot:run**

## Steps to execute using gradle
* Navigate to project in terminal
* Run command **gradlew clean bootRun**

## Create executable jar using maven and run it
```
mvn clean compile package
java -jar target\data-jpa-with-h2.jar
```

## Create executable jar using gradle and run it
```
gradlew clean compileJava build
java -jar build\libs\data-jpa-with-h2-1.0.jar
```