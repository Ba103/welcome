FROM openjdk:11
EXPOSE 8080
COPY target/Welcome_Service.jar Welcome_Service.jar
ENTRYPOINT ["java","-jar","/Welcome_Service.jar"]
