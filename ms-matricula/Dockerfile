FROM maven:3.9.9-eclipse-temurin-21 AS build

WORKDIR /workspace

COPY pom.xml .
COPY ms-matricula/pom.xml ms-matricula/pom.xml

RUN mvn -B -f ms-matricula/pom.xml dependency:go-offline

COPY ms-matricula/src ms-matricula/src

RUN mvn -B -f ms-matricula/pom.xml clean package -Dmaven.test.skip=true

FROM eclipse-temurin:21-jre

WORKDIR /app

COPY --from=build /workspace/ms-matricula/target/*.jar app.jar

EXPOSE 8084

ENTRYPOINT ["java", "-jar", "app.jar"]