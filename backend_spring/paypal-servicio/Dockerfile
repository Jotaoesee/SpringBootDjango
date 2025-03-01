FROM openjdk:17
WORKDIR /app
ARG JAR_FILE=target/paypal-service-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
EXPOSE 8084
CMD ["java", "-jar", "app.jar"]