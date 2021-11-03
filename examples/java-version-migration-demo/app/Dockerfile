FROM adoptopenjdk:8u292-b10-jre-hotspot
#FROM adoptopenjdk/openjdk11:x86_64-alpine-jre-11.0.13_8
#FROM eclipse-temurin:17_35-jdk-focal
WORKDIR /opt/app
COPY build/libs/app.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
