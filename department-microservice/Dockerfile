# Image JRE légère et récente
FROM eclipse-temurin:21-jre

# Variables runtime
ENV SPRING_PROFILES_ACTIVE=prod \
    JAVA_OPTS=""

# Copie n'importe quel jar Spring Boot packagé, on le renomme en app.jar
COPY target/*-SNAPSHOT.jar /app/app.jar

# Port exposé par l'app
EXPOSE 8080

# Lancement
ENTRYPOINT ["sh","-c","java $JAVA_OPTS -jar /app/app.jar"]
