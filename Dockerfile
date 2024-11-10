# Use a JDK 17 base image
FROM eclipse-temurin:17-jdk-jammy as builder

# Set working directory in the container
WORKDIR /app

# Copy the Maven project files to the container
COPY pom.xml .
COPY src ./src

# Build the application using Maven
RUN ./mvnw clean package -DskipTests

# Start a new stage from a lighter base image
FROM eclipse-temurin:17-jre-jammy

# Set the working directory in the container
WORKDIR /app

# Copy the packaged JAR file from the builder stage
COPY --from=builder /app/target/prativa-on-canvas.jar app.jar

# Expose port 8080 for the application
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
