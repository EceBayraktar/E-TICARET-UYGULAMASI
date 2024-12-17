FROM openjdk:23-jdk
WORKDIR /app
COPY target/gateway-services-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8081:8081
ENTRYPOINT ["java", "-jar", "app.jar"]