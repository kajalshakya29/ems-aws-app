# Step 1: Use Java 17 runtime
FROM openjdk:17-jdk-slim
WORKDIR /app

# Step 2: Build se bani JAR file ko copy karein
# Spring Initializr project mein artifact 'demo' hai, toh file 'demo-0.0.1-SNAPSHOT.jar' hogi
COPY target/*.jar app.jar

# Step 3: Run the application
EXPOSE 8089
ENTRYPOINT ["java", "-jar", "app.jar"]