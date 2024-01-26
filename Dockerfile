FROM openjdk:11
MAINTAINER github/jessicaplm
ADD target/treinamentoawsaulasqs-0.0.1-SNAPSHOT.jar treinamentoawsaulasqs-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "treinamentoawsaulasqs-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080
