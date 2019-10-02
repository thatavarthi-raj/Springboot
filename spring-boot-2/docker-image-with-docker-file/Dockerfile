FROM openjdk:8-jdk-alpine
COPY target/docker-image-with-docker-file.jar docker-image-with-docker-file.jar
EXPOSE 9080
ENTRYPOINT ["java", "-jar", "docker-image-with-docker-file.jar"]