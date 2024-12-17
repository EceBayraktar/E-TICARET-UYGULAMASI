FROM openjdk:23-jdk
WORKDIR /app
COPY target/siparis-services-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8082:8082
ENTRYPOINT ["java", "-jar", "app.jar"]
