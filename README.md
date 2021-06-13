# Java Spring Boot Web Content with logback (logback-spring) Logging Configuration Demo Repo
This is demo repo to demostrate how to work with build-in & [logback (logback-spring)](https://docs.spring.io/spring-boot/docs/2.1.1.RELEASE/reference/html/boot-features-logging.html) logging in Java Spring Boot web. Logging will output to STROUT and log path (/logs/log.log). This repo also contain containerization materials for futher deployment in Kubernetes (K8S) cluster (e.g Azure Kubernetes Service (AKS)). 

Readme update 1.0

## With Java Spring Boot Build-in Logging
```shell
/src/main/resources/application.properties
```

## With Logback (logback-spring) Logging
* Logging format = Datetime, Host IP, Process ID, Log Level, Java Class for Logging, Client IP, Message for Logging
```shell
/src/main/resources/logback-spring.xml
```

## Build with Maven
```shell
mvn clean package
```

## Run locally
```shell
java -jar target/serving-web-content-demo-0.0.1.jar
```

## Test web app locally
```shell
http://localhost:8080
```

## Containerize
1. Build a docker image using `Dockerfile`:
   ```
   docker build -t serving-web-content-demo .
   ```
2. Run docker image locally
   ```
   docker run --rm -p 8080:8080 serving-web-content-demo
   ```
3. Then you can access the web app at http://localhost:8080 in browser.

## Deploy to K8S
```shell
kubectl apply -f serving-web-content-demo-aks.yaml
```