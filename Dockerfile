FROM openjdk:15.0.1-jdk-slim as builder
RUN mkdir -p /app/src
COPY . /app/src
WORKDIR /app/src
RUN ./mvnw clean package

FROM openjdk:15.0.1-jdk-slim as runtime
COPY --from=builder /app/src/target/*.jar /app/app.jar
COPY --from=builder /app/src/src/main/resources/application.properties /app/config/application.properties
EXPOSE 8080

CMD ["java","-Xms128M","-Xmx1G","-Dspring.config.location=/app/config/application.properties","-jar","/app/app.jar"]
