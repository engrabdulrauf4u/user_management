FROM adoptopenjdk/openjdk11:jre-11.0.9.1_1-alpine

EXPOSE 9001

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} user_service-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "user_service-0.0.1-SNAPSHOT.jar"]

