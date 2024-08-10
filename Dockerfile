FROM openjdk:17
EXPOSE 5000
COPY target/ecotrack.jar ecotrack.jar
ENTRYPOINT ["java","-jar","ecotrack.jar"]