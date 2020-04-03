FROM openjdk
FROM openjdk:8
EXPOSE 9000
ADD target/loggin.jar loggin.jar
ENTRYPOINT ["java","-jar","loggin.jar"]