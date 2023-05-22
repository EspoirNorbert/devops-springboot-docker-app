# Build stage
FROM maven AS build
COPY . .
RUN mvn clean package -Pprod -DskipTests

FROM openjdk:17-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY --from=build /${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","app.jar"]