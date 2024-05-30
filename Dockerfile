# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-alpine

# Set the working directory in the container
WORKDIR /app

# Copy the application jar file into the container
# ARG JAR_FILE=./target/TrainingApp.jar
COPY ./target/TrainingApp.jar TrainingApp.jar

# Make port 8080 available to the world outside this container
EXPOSE 8080

# Run the jar file
ENTRYPOINT ["java", "-jar", "./TrainingApp.jar"]