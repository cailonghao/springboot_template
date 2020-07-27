FROM openjdk:8-jre-alpine

WORKDIR /usr/local/src/boot

EXPOSE 10000

ADD target/*.jar app.jar

CMD ["java","-jar","/usr/local/src/boot/app.jar"]