FROM openjdk:23-jdk
WORKDIR /app
COPY target/urun-servicess-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8087:8087
ENTRYPOINT ["java", "-jar", "app.jar"]
