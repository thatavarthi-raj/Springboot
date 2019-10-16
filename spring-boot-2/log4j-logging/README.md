# Spring Boot 2 Logging with Log4J, SLF4, Lombok

## Create project using maven
```
mvn archetype:generate -DgroupId=log4j.logging -DartifactId=log4j-logging -Dversion=1.0 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```

## Add gradle
```
gradle init --type pom
```

## Versions
* Maven **3.5.2**
* Gradle **5.0**

## Steps in Maven
* Exclude **spring-boot-starter-logging** from **spring-boot-starter**
```
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter</artifactId>
	<exclusions>
		<exclusion>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-logging</artifactId>
		</exclusion>
	</exclusions>
</dependency>
```
* Add **spring-boot-starter-log4j2** dependency
* Refer [pom.xml](pom.xml)

## Steps in Gradle
* Exclude **spring-boot-starter-logging** module
```
configurations{
	compile.exclude module: "spring-boot-starter-logging"
}
```
* Add **spring-boot-starter-log4j2** dependency
```
compile "org.springframework.boot:spring-boot-starter-log4j2"
```
* Refer [build.gradle](build.gradle)

## Run this project
* Import project into IDE as Maven or Gradle project
* Execute App class in each package
* Hit GET API **http://localhost:9000/actuator**

## API
* Refer [files/log4j-logging.postman_collection.json](files/log4j-logging.postman_collection.json)

## Run using maven
```
mvn clean compile spring-boot:run
```

## Run using gradle
```
gradlew clean compileJava bootRun
```

## Create package using maven
```
mvn clean compile package
```

## Create package using gradle
```
gradlew clean compileJava build
```

## Execute jar of Maven
```
java -jar target\log4j-logging.jar
```

## Execute jar of Gradle
```
java -jar build\lib\log4j-logging.jar
```

## Asynchronous Loggers
* Add **lmax disruptor** dependency
```
<dependency>
	<groupId>com.lmax</groupId>
	<artifactId>disruptor</artifactId>
	<version>3.4.2</version>
</dependency>
```
* Set the System property
```
log4j2.contextSelector=org.apache.logging.log4j.core.async.AsyncLoggerContextSelector
```
* Executing jar by passing system property
```
java -Dlog4j2.contextSelector=org.apache.logging.log4j.core.async.AsyncLoggerContextSelector -jar target/log4j-logging.jar
```

## Use log4j.xml out side jar
* Give location of log4j xml file while running jar **logging.config**
```
java -jar -Dlogging.config=[path]\log4j2.xml target\log4j-logging.jar
```