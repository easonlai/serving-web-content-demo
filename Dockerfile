FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/serving-web-content-demo-0.0.1.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]