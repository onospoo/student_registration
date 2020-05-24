FROM maven:3.6.3-jdk-11 AS builder
WORKDIR /app

COPY pom.xml .
RUN mvn dependency:resolve

COPY src src
RUN mvn package -DskipTests

FROM adoptopenjdk/openjdk11:alpine-jre
WORKDIR /app

COPY --from=builder /app/target/student_registration-0.0.1-SNAPSHOT.jar /app
CMD exec java -jar student_registration-0.0.1-SNAPSHOT.jar