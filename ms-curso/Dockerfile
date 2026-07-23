FROM maven:3.9.9-eclipse-temurin-21 AS build

WORKDIR /workspace

COPY pom.xml .
COPY ms-curso/pom.xml ms-curso/pom.xml

RUN mvn -B -f ms-curso/pom.xml dependency:go-offline

COPY ms-curso/src ms-curso/src

RUN mvn -B -f ms-curso/pom.xml clean package -Dmaven.test.skip=true

FROM eclipse-temurin:21-jre

WORKDIR /app

COPY --from=build /workspace/ms-curso/target/*.jar app.jar

EXPOSE 8083

ENTRYPOINT ["java", "-jar", "app.jar"]