
FROM maven:3-eclipse-temurin-8


WORKDIR /webapp

COPY . .

RUN mvn package

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "./target/webapp-0.0.1-SNAPSHOT.jar"]