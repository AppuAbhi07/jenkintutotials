FROM eclipse-temurin:21-jre
EXPOSE 8080
ADD target/JenkingTutotials-0.0.1-SNAPSHOT.jar JenkingTutotials-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/JenkingTutotials-0.0.1-SNAPSHOT.jar"]