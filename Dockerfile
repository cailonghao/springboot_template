FROM openjdk:8-jre-alpine

WORKDIR /usr/local/src/boot

ARG JARPATH

EXPOSE 10000

ADD target/*.jar app.jar

ENTRYPOINT ["java","-jar","app.jar"]