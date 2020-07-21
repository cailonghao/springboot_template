FROM openjdk:8-jre-alpine

WORKDIR /usr/local/src/boot

EXPOSE 10000

ADD $jarpath/*.jar app.jar

ENTRYPOINT ["java","-jar","app.jar"]