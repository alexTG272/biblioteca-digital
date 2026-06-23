# Etapa 1: Construcción (Build) usando el JDK de Java 17 y tu Maven Wrapper
FROM eclipse-temurin:17-jdk-alpine AS build
WORKDIR /app

# Copiamos las herramientas de Maven que ya tienes en tu proyecto
COPY .mvn/ .mvn
COPY mvnw pom.xml ./

# Damos permisos de ejecución al script de Maven y descargamos las dependencias
RUN chmod +x mvnw && ./mvnw dependency:go-offline

# Copiamos el código fuente de tu app
COPY src ./src

# Compilamos el archivo .jar saltando las pruebas (las correrá el pipeline)
RUN ./mvnw clean package -DskipTests

# Etapa 2: Imagen de ejecución (Run) ultra ligera utilizando solo el JRE
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app

# Copiamos el archivo .jar generado en la etapa anterior
COPY --from=build /app/target/*.jar app.jar

# Exponemos el puerto estándar de Spring Boot
EXPOSE 8080

# Comando para iniciar tu microservicio
ENTRYPOINT ["java", "-jar", "app.jar"]