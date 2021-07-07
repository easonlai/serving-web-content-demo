FROM openjdk:8-jdk-alpine
RUN apk add --no-cache tini
VOLUME /tmp
ADD target/serving-web-content-demo-0.0.1.jar app.jar
ENTRYPOINT ["/sbin/tini", "--"]
CMD ["java","-jar","/app.jar"]
#ENTRYPOINT ["/bin/sh","-c"," java -jar /app.jar"]
#ENTRYPOINT ["java","-jar","/app.jar"]