# Dependency Injection using Xml

## Create project using maven
```
mvn archetype:generate -DgroupId=spring.boot.profiles -DartifactId=profiles -Dversion=1.0 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```

## Add gradle
```
gradle init --type pom
```

## Versions
* Maven **3.5.2**
* Gradle **5.0**

## Dependencies
* org.springframework:spring-boot-starter-web:2.1.8.RELEASE

## Steps
* Create **application.properties** file in src/main/resources
* Create **application-dev.properties** file in src/main/resources
* Create **application-test.properties** file in src/main/resources
* Create **application-prod.properties** file in src/main/resources
* Add **spring.profiles.active=prod** in application.properties
* Based on property above respective **application-{profile}.properties** will picked by spring boot

## Run this project
* Import project into IDE as Maven or Gradle project
* Execute **spring.boot.profiles.App**

## Run using maven
```
mvn clean compile spring-boot:run
```

## Run using gradle
```
gradlew clean compileJava bootRun
```

## Execute jar created with maven
* Package with maven
```
mvn clean compile package
```
* Execute jar
```
java -jar target/profiles.jar
```

## Execute jar created with gradle
* Package with maven
```
gradlew clean build
```
* Execute jar
```
java -jar build/libs/profiles.jar
```