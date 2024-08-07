Certainly! Here is the revised README for the Retrospective Web Application, with the React Frontend section removed:

---

# Retrospective Web Application

A Java Spring Boot application for managing retrospectives.

## Table of Contents

* [Introduction](#introduction)
* [Features](#features)
* [Requirements](#requirements)
* [Installation](#installation)
* [Usage](#usage)
* [API Documentation](#api-documentation)
* [Contributing](#contributing)
* [License](#license)

## Introduction

The Retrospective Web Application is a Java Spring Boot application designed to facilitate the management of retrospectives. It offers a REST API for creating, reading, updating, and deleting retrospectives.

## Features

* **User Authentication and Authorization**: Secure access with user roles.
* **Email Verification**: Ensure user identity through email confirmation.
* **Role-Based Access Control**: Supports admin, scrum master, and user roles.
* **CRUD Operations**: Create, read, update, and delete retrospectives.
* **API Documentation**: Comprehensive API documentation using Swagger.

## Requirements

* **Java**: Version 11 or higher
* **Spring Boot**: Version 2.5 or higher
* **H2 Database**: Version 1.4 or higher
* **Build Tools**: Maven or Gradle

## Installation

1. Clone the repository:
   ```bash
   git clone <repository-url>
   ```
2. Build the project using Maven or Gradle:
   ```bash
   ./mvnw clean install
   # or
   ./gradlew clean build
   ```
3. Run the application:
   ```bash
   ./mvnw spring-boot:run
   # or
   ./gradlew bootRun
   ```

## Usage

1. Access the application at `http://localhost:8080`.
2. Utilize the API endpoints to manage retrospectives.
3. Refer to the API documentation to explore available endpoints and their usage.

## API Documentation

Access the API documentation at `http://localhost:8080/swagger-ui.html`.

## Contributing

Contributions are welcome! Please submit a pull request with your changes and include a brief description of what you've added or fixed.

## License

This project is licensed under the MIT License.

---

### Here are some useful commands for building and deploying application:

```markdown
1. **Build the Application**:
   ```bash
   ./gradlew clean build
   ```

2. **Start Services with Docker Compose**:
   ```bash
   docker-compose up -d
   ```

3. **Build the Docker Image**:
   ```bash
   docker build -t your-spring-boot-app-image .
   ```

4. **Run the Docker Container**:
   ```bash
   docker run -p 8080:8080 your-spring-boot-app-image
   ```
```