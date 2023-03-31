FROM adoptopenjdk/openjdk11:jre-11.0.9.1_1-alpine

EXPOSE 8080

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} apigateway-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "apigateway-0.0.1-SNAPSHOT.jar"]

