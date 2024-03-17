FROM maven:3.8.3-openjdk-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17.0.1-jdk-slim
WORKDIR /app
COPY --from=build target/Zomato-0.0.1-SNAPSHOT.jar zomato.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","zomato.jar"]
