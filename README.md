# Spring Boot Docker App

This project is a Spring Boot application that can be packaged into a Docker image for easy deployment and management of the application.

## Prerequisites

Before getting started, make sure you have the following installed on your development system:

- Java Development Kit (JDK) 11 or later
- Docker

## Building the Project

To build the project, follow the steps below:

1. Clone this repository to your local machine:
```
git clone <REPO_URL>
```
2. Navigate to the project directory:
```
cd spring-boot-docker-app
```
3. Build the project using Maven:
```
./mvnw clean package
```

This command will compile the project, run tests, and create an executable JAR file in the `target` directory.

## Building the Docker Image

To build the Docker image for the Spring Boot application, follow the steps below:

1. Make sure Docker is running on your system.

2. In the project directory, run the following command to build the Docker image:
```
docker build -t spring-boot-docker-app .
```

This command uses the provided Dockerfile to build a Docker image named `spring-boot-docker-app`.

## Running the Application in a Docker Container

Once the Docker image is built, you can run the application in a Docker container by following these steps:

1. Run the following command to start a container based on the Docker image you created:
```
docker run -p 8080:8080 spring-boot-docker-app
```
This will start a Docker container and map port 8080 of the container to port 8080 on your host machine.

2. Access the application in your browser using the following URL:
```
http://localhost:8080
```
You should see the Spring Boot application displayed in your browser.