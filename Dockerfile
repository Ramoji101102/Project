FROM openjdk:17
EXPOSE 9056
ADD target/demoamdocs.jar demoamdocs.jar
ENTRYPOINT ["java","-jar","/demoamdocs.jar"]
