FROM openjdk:17-oracle
VOLUME /tmp
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
#PS service : mvn clean package -DskipTests

#docker build . -t vente-discovery-service:v1

#docker ps : conteneur actif

#docker stop id

#docker run -p 8761:8761 vente-discovery-service:v1
#docker run -d -p 8761:8761 vente-discovery-service:v1