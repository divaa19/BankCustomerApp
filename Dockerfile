FROM maven:3.6.3-openjdk-11-slim AS build
RUN mkdir -p /workspace
WORKDIR /workspace
COPY pom.xml /workspace
COPY src /workspace/src
RUN mvn -B package --file pom.xml -DskipTests

FROM openjdk:11-jre-slim
COPY --from=build /workspace/target/*.jar bankcustomerApp-1.0.0.jar
ENTRYPOINT ["java","-jar","/bankcustomerApp-1.0.0.jar"]