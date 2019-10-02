# Spring Boot 2 Actuator

## Create project using maven
```maven command
mvn archetype:generate -DgroupId=spring.boot.actuator -DartifactId=spring-boot-actuator -Dversion=1.0 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```

## Add gradle
```gradle command
gradle init --type pom
```

## Dependencies
* spring-boot-starter-parent:2.1.8.RELEASE
* spring-boot-starter-web
* spring-boot-starter-test
* spring-boot-starter-actuator
* org.projectlombok:lombok

## Description
* Actuator end points
* Import **files/spring-boot-actuator.postman_collection.json** to postman to execute actuator end points
* **[References](#References)** to see full list of end points

## References
* [DZone](https://dzone.com/articles/spring-boot-actuator-in-spring-boot-20)
* [Baeldung](https://www.baeldung.com/spring-boot-actuators)
* [All available actuator end points](https://docs.spring.io/spring-boot/docs/current/reference/html/production-ready-endpoints.html)