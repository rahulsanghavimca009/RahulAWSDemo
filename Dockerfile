FROM eclipse-temurin:17-jre
WORKDIR /app
COPY target/RahulAWSDemo.jar /app/RahulAWSDemo.jar
CMD ["java", "-jar", "RahulAWSDemo.jar"]
EXPOSE 9090