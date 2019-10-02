# Spring Boot 2 Docker image with Dockerfile

## Create project using maven
```
mvn archetype:generate -DgroupId=com.docker.image.dockerfile -DartifactId=docker-image-with-docker-file -Dversion=1.0 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```
## Versions
* Maven version: **3.6.2**

## Dependencies
* spring-boot-starter-parent: 2.1.8.RELEASE
* spring-boot-starter-web
* org.projectlombok:lombok

## Steps to create image and start the container
* Go to project location in terminal and run following command to create jar
```
mvn clean compile package
```
* Create docker image using following command
```
docker build -t spring-boot-2-maven-docker-image-with-dockerfile .
```
* Create container using docker image created in above step
```
docker run -it -p 9081:9080 spring-boot-2-maven-docker-image-with-dockerfile
```
* Refer **files/spring-boot-2-maven-docker-image-with-docker-file.postman_collection.json** for API

## References
* [https://www.javacodegeeks.com/2019/08/dockerizing-spring-boot-application-2.html](https://www.javacodegeeks.com/2019/08/dockerizing-spring-boot-application-2.html)
* [https://www.baeldung.com/dockerizing-spring-boot-application](https://www.baeldung.com/dockerizing-spring-boot-application)
* [https://www.callicoder.com/spring-boot-docker-example/](https://www.callicoder.com/spring-boot-docker-example/)
* [https://spring.io/guides/gs/spring-boot-docker/](https://spring.io/guides/gs/spring-boot-docker/)