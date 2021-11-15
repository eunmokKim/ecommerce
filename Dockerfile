FROM openjdk:8
VOLUME /tmp
ADD target/spring-boot-docker.jar spring-boot-docker.jar
EXPOSE 8761
ENTRYPOINT ["java", "-jar", "spring-boot-docker.jar"]