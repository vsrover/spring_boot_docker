FROM maven:3.6.2-jdk-11

WORKDIR /app

COPY pom.xml ./
COPY src ./src/

RUN mvn package

CMD ["java", "-jar", "/app/target/api.jar"]
