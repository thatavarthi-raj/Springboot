# Spring Boot 2 Logging with Log4J, SLF4, Lombok

## Create project using maven
```
mvn archetype:generate -DgroupId=read.yaml.outside.jar -DartifactId=read-yaml-file-outside-jar -Dversion=1.0 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
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
-Dapp.properties.file=[path]\application.yml
```

## API
* Refer [files/read-propeties-file-outside-jar.postman_collection.json](files/read-propeties-file-outside-jar.postman_collection.json)

## Run From Eclipse/STS
* Right click on **read.properties.outside.jar.App**
* Run As - Run Configurations
* Arguments tab - VM arguments
* Give **-Dapp.properties.file=[path]\application.yml**
* Click on **Apply** - **Run**
* Tomcat should be started on port **9000**

## Run using Maven
* Create jar
```
mvn clean compile package
```
* Execute jar
```
java -jar -Dapp.properties.file=[path]\application.yml target\read-yaml-file-outside-jar.jar
```

## Run using Gradle
* Create jar
```
gradlew clean compileJava build
```
* Execute jar
```
java -jar -Dapp.properties.file=[path]\application.yml build\libs\read-yaml-file-outside-jar-1.0.jar
```