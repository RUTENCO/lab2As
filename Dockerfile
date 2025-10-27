# Etapa de construcción

FROM maven:latest AS build 

WORKDIR /app

COPY . .

RUN mvn clean package -DskipTests



# Etapa de empaquetado (runtime)

FROM openjdk:21-jdk-slim

WORKDIR /app

# Copia el JAR de la etapa 'build' a la etapa actual

COPY --from=build /app/target/lab2As.jar lab2As.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","lab2As.jar"]