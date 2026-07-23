FROM maven:3.9.9-eclipse-temurin-21 AS build

WORKDIR /workspace

COPY pom.xml .
COPY ms-configserver/pom.xml ms-configserver/pom.xml

RUN mvn -B -f ms-configserver/pom.xml dependency:go-offline

COPY ms-configserver/src ms-configserver/src

RUN mvn -B -f ms-configserver/pom.xml clean package -Dmaven.test.skip=true

FROM eclipse-temurin:21-jre

WORKDIR /app

COPY --from=build /workspace/ms-configserver/target/*.jar app.jar

EXPOSE 8888

ENTRYPOINT ["java", "-jar", "app.jar"]