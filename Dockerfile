FROM openjdk:17
EXPOSE 8080 8000
ADD target/hello-world-001.jar hello-world-001.jar
ENTRYPOINT ["java","-jar","/hello-world-001.jar"]