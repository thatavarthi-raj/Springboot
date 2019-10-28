# Response Header for Each API

## Requirement
* Include response header for each REST API response

## Create project using maven
```
mvn archetype:generate -DgroupId=com.api.response.header -DartifactId=api-response-header -Dversion=1.0 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```

## Add gradle
```
gradle init --type pom
```

## Versions
* Maven **3.5.2**
* Gradle **5.0**

## Ways
* [Using HttpServletResponse](#using-httpServletResponse)
* [Using ResponseEntity](#using-responseEntity)
* [Using Filter To All APIs](#using-filter-to-all-aPIs)

## Using HttpServletResponse
* Pass **HttpServletResponse** as an argument to API method
* Add header to **HttpServletResponse** object
* Refer **com.api.response.header.controller.AppController.apiOne** method

## Using ResponseEntity
* Create HttpHeaders object. Add header to HttpHeaders object
```
HttpHeaders httpHeaders = new HttpHeaders();
httpHeaders.set("response-header", "response-header-value");
httpHeaders.set("transaction-id", String.valueOf(UUID.randomUUID()));
return ResponseEntity.ok().headers(httpHeaders).body(student);
```
* Refer **com.api.response.header.controller.AppController.apiTwo** method

## Using Filter To All APIs
* Add header to **javax.servlet.http.HttpServletResponse**
* Refer **com.api.response.header.filter.RequestResponseFilter.doFilter**

## API
* Refer **files/api-response-header.postman_collection.json**

## Run this project
* Import project into IDE as Maven or Gradle project
* Execute **com.api.response.header.App** class in each package

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

## Execute jar of Maven
```
java -jar target\api-response-header.jar
```

## Create package using gradle
```
gradlew clean compileJava build
```

## Execute jar of Gradle
```
java -jar build\libs\api-response-header-1.0.jar
```

## References
* [https://www.baeldung.com/spring-response-header](https://www.baeldung.com/spring-response-header)