# Use a base image with Java
FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the packaged jar file into the Docker image
COPY build/libs/retrospective-app-back-0.0.1-SNAPSHOT.jar app.jar
# Expose the port the app runs on
EXPOSE 8080

# Run the jar file
ENTRYPOINT ["java", "-jar", "app.jar"]

ENV SPRING_PROFILES_ACTIVE=docker