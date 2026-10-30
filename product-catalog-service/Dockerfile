FROM eclipse-temurin:21-jre
WORKDIR /app
COPY target/product-catalog-service.jar product-catalog.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","product-catalog.jar"]