# ShopFlow Product Service

Simple Spring Boot Product CRUD microservice.

## Technologies

- Java 21
- Spring Boot 3.5.6
- Spring Web
- Spring Data JPA
- MySQL Driver
- Maven

## Database

The application creates the database automatically if it does not exist.

Update this line in `application.properties`:

```properties
spring.datasource.password=YOUR_MYSQL_PASSWORD
```

Make sure MySQL is running.

## Run

```bash
mvn clean spring-boot:run
```

The service runs on:

```text
http://localhost:8082
```

## CRUD APIs

### Create

POST `/api/products`

```json
{
  "name": "iPhone 17",
  "description": "Apple smartphone",
  "price": 79999.00,
  "stock": 10
}
```

### Get all

GET `/api/products`

### Get by ID

GET `/api/products/1`

### Update

PUT `/api/products/1`

```json
{
  "name": "iPhone 17 Pro",
  "description": "Updated smartphone",
  "price": 99999.00,
  "stock": 8
}
```

### Delete

DELETE `/api/products/1`
