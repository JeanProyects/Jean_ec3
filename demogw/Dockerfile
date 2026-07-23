FROM maven:3.9.9-eclipse-temurin-21 AS build

WORKDIR /workspace

COPY pom.xml .
COPY demogw/pom.xml demogw/pom.xml

RUN mvn -B -f demogw/pom.xml dependency:go-offline

COPY demogw/src demogw/src

RUN mvn -B -f demogw/pom.xml clean package -Dmaven.test.skip=true

FROM eclipse-temurin:21-jre

WORKDIR /app

COPY --from=build /workspace/demogw/target/*.jar app.jar

EXPOSE 9090

ENTRYPOINT ["java", "-jar", "app.jar"]