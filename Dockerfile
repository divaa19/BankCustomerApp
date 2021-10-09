FROM openjdk:11-jre-slim
COPY target/*.jar bankcustomerApp-1.0.0.jar
ENTRYPOINT ["java","-jar","/bankcustomerApp-1.0.0.jar"]