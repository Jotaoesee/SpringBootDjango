FROM openjdk:17
WORKDIR /app
ARG JAR_FILE=target/user-service-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
EXPOSE 8081
CMD ["java", "-jar", "app.jar"]