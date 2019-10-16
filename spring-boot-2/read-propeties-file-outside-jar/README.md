# Spring Boot 2 Read Properties file that is outside jar

## Requirement
* Read properties file
* Properties file is not part jar
* Properties file path should be passed as VM argument while starting the application

## Create project using maven
```
mvn archetype:generate -DgroupId=read.properties.outside.jar -DartifactId=read-propeties-file-outside-jar -Dversion=1.0 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```

## Add gradle
```
gradle init --type pom
```

## Versions
* Maven **3.5.2**
* Gradle **5.0**

## Steps
* Add spring boot dependencies. Refer [pom.xml](pom.xml)
* Declare annotation **org.springframework.context.annotation.PropertySource** on main class **read.properties.outside.jar.App**
* Pass JVM argument **app.properties.file** while executing jar
```
-Dapp.properties.file=[projection-location]\files\application.properties
```

## API
* Refer [files/read-propeties-file-outside-jar.postman_collection.json](files/read-propeties-file-outside-jar.postman_collection.json)

## Run From Eclipse/STS
* Right click on **read.properties.outside.jar.App**
* Run As - Run Configurations
* Arguments tab - VM arguments
* Give **-Dapp.properties.file=[projection-location]\files\application.properties**
* Click on **Apply** - **Run**
* Tomcat should be started on port **9000**

## Run using Maven
* Create jar
```
mvn clean compile package
```
* Execute jar
```
java -jar -Dapp.properties.file=[projection-location]\files\application.properties target\read-propeties-file-outside-jar.jar
```

## Run using Gradle
* Create jar
```
gradlew clean compileJava build
```
* Execute jar
```
java -jar -Dapp.properties.file=[projection-location]\files\application.properties build\libs\read-propeties-file-outside-jar-1.0.jar
```