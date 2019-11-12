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
* Actuator is enabled with dependency **spring-boot-starter-actuator**
* Actuator end points
* Import **files/spring-boot-actuator.postman_collection.json** to postman to execute actuator end points
* **[References](#References)** to see full list of end points

## Custom actuator end points
* Implement **org.springframework.boot.actuate.health.HealthIndicator**
* Override health() method
* Refer [src/main/java/spring/boot/actuator/custom/actuators/AppHealthIndicator.java](src/main/java/spring/boot/actuator/custom/actuators/AppHealthIndicator.java)
* Open url **http://localhost:9091/actuator/health**

## Information to /info end point
* All below properties in application.yml will be returned as **/info** response
```
info.app.name=spring-boot-actuator-practice-examples
info.app.description=Spring Boot Actuator Practice Examples
info.app.version=1.0
info.java-vendor = ${java.specification.vendor}
```
* Refer [src/main/resources/application.properties](src/main/resources/application.properties)
* Check **/actutor/info** response

## Custom information to /info end point
* Write a class implements **org.springframework.boot.actuate.info.InfoContributor**
* Override **contribute(..)** method
* Add information needed to **org.springframework.boot.actuate.info.Info.Builder** object
* Refer [src/main/java/spring/boot/actuator/component/InfoContributorComponent.java](src/main/java/spring/boot/actuator/component/InfoContributorComponent.java)
* Check **/actutor/info** response

## Postman Collection
* Refer [files/spring-boot-actuator.postman_collection.json](files/spring-boot-actuator.postman_collection.json)

## Some End Points
* /acutator
* /health
* /autoconfig
* /beans
* /configprops
* /dump

## References
* [DZone](https://dzone.com/articles/spring-boot-actuator-in-spring-boot-20)
* [Baeldung](https://www.baeldung.com/spring-boot-actuators)
* [All available actuator end points](https://docs.spring.io/spring-boot/docs/current/reference/html/production-ready-endpoints.html)

## Create jar with maven
```
mvn clean compile package
```

## Execute jar created with maven
```
java -jar target\spring-boot-actuator.jar
```

## Create jar with Gradle
```
gradlew clean compileJava build
```

## Execute jar create with Gradle
```
java -jar build\libs\spring-boot-actuator-1.0.jar
```