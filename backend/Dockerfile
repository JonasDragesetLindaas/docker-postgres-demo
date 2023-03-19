# Build stage
FROM maven:3.9.0-eclipse-temurin-17 AS build
COPY src /app/src
COPY pom.xml /app
RUN mvn -f /app/pom.xml clean package

# Package stage
FROM eclipse-temurin:17
COPY --from=build /app/target/demo-0.0.1-SNAPSHOT.jar /usr/local/lib/demo-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/usr/local/lib/demo-0.0.1-SNAPSHOT.jar"]