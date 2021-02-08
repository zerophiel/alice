FROM openjdk:15.0.1-jdk-slim

COPY /target/alice-0.0.1-SNAPSHOT.jar /app/alice-0.0.1-SNAPSHOT.jar
COPY /src/main/resources/application.properties /app/config/application.properties

EXPOSE 8080

CMD ["java","-Xms128M","-Xmx1G","-Dspring.config.location=/app/config/application.properties","-jar","/app/alice-0.0.1-SNAPSHOT.jar"]
