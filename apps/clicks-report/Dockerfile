FROM openjdk:11.0.3-jdk-slim
VOLUME /tmp
COPY ./build/libs/clicks-report-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]