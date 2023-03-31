FROM adoptopenjdk/openjdk11:jre-11.0.9.1_1-alpine

EXPOSE 8761

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} e_server-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "e_server-0.0.1-SNAPSHOT.jar"]

