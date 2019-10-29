# Request and Header Params pass as Bean argument to API method

## Requirement
* Request Params should be assigned to properties to Bean
* Bean should be passed as an argument to API method

## Create project using maven
```
mvn archetype:generate -DgroupId=request.header.params.bean -DartifactId=request-header-params-bean -Dversion=1.0 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```

## Add gradle
```
gradle init --type pom
```

## Versions
* Maven **3.5.2**
* Gradle **5.0**

## Steps
* Add Spring Boot dependencies. Refer [pom.xml](pom.xml) (or) [build.gradle](build.gradle)
* Create model class for all request params
* Initialize properties. If request parameter is not passed default values will be taken
* Pass model as argument to API method
* Refer **com.app.request.params.RequestParamsController.requestParams**

## API
* Refer [files/request-header-params-bean.postman_collection.json](files/request-header-params-bean.postman_collection.json)

## Run project from IDE
* Import project into IDE as Maven or Gradle project
* Execute App class in each package

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
java -jar target\request-header-params-bean.jar
```

## Create package using gradle
```
gradlew clean compileJava build
```

## Execute jar of Gradle
```
java -jar build\libs\request-header-params-bean-1.0.jar
```