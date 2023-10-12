FROM openjdk:17
EXPOSE 8080 8000
ADD target/hello-world-001.jar hello-world-001.jar
ADD entrypoint.sh entrypoint.sh
ENTRYPOINT ["sh","/entrypoint.sh"]