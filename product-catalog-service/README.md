# Product Catalog Service

A REST API project built with Java 21 and Spring Boot 4.0.0.

## Dependencies

- Spring Web (`spring-boot-starter-web`)
- Spring Data JPA (`spring-boot-starter-data-jpa`)
- MySQL Connector/J (`mysql-connector-j`)
- Spring Boot Validation
- Spring Boot Test

## Requirements

- JDK 21
- Maven 3.6.3+
- MySQL 8+

## Configure MySQL

1. Start your MySQL server.
2. Open `src/main/resources/application.properties`.
3. Replace `YOUR_MYSQL_PASSWORD` with your local MySQL password.
4. The configured JDBC URL creates the `product_catalog` database if it does not already exist.

## Run

```bash
mvn clean install
mvn spring-boot:run
```

The application runs at `http://localhost:8080`.

## REST API endpoints

| Method | Endpoint | Description |
|---|---|---|
| GET | `/api/products` | Get all products |
| GET | `/api/products/{id}` | Get product by ID |
| GET | `/api/products/search?name=phone` | Search products by name |
| GET | `/api/products/category/electronics` | Filter by category |
| POST | `/api/products` | Create product |
| PUT | `/api/products/{id}` | Update product |
| DELETE | `/api/products/{id}` | Delete product |

## Create product example

POST `http://localhost:8080/api/products`

```json
{
  "name": "Samsung Galaxy S25",
  "description": "Android smartphone",
  "price": 79999.00,
  "category": "Electronics",
  "stockQuantity": 20,
  "active": true
}
```

## Package structure

```text
com.ranjan.productcatalog
├── controller
│   └── ProductController.java
├── dto
│   └── ProductRequest.java
├── entity
│   └── Product.java
├── exception
│   ├── GlobalExceptionHandler.java
│   └── ProductNotFoundException.java
├── repository
│   └── ProductRepository.java
├── service
│   └── ProductService.java
└── ProductCatalogServiceApplication.java
```

## Request flow

Client -> ProductController -> ProductService -> ProductRepository -> MySQL

The controller handles HTTP requests, the service contains business logic, the repository performs database operations, and JPA maps the Product entity to the `products` table.
