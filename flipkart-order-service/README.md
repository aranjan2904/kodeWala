# Flipkart Order Service

A starter Spring Boot microservice for a Flipkart-style e-commerce system. It is separate from the existing ShopFlow Order Service.

## Included

- REST APIs to create and retrieve orders
- Spring Data JPA + MySQL persistence
- OpenFeign client for synchronous Inventory Service calls
- Eureka client for service discovery
- Spring Cloud Config client
- Redis cache for order lookups
- Actuator health/info endpoints
- Spring Boot test dependencies

## Important compatibility note

This project keeps the requested versions: Spring Boot `4.1.1`, Spring Cloud `2025.1.3`, and Java `17`. Spring Cloud's compatibility information may vary by release; if Maven reports a Spring Cloud compatibility-verifier error, use a Spring Cloud `2025.1.x` release explicitly compatible with Spring Boot `4.1.1` (or align the Boot version to the Cloud release). Check the official Spring Cloud compatibility table before changing versions.

## Requirements

- JDK 17+
- Maven 3.6.3+
- MySQL
- Redis
- Eureka Server (optional for local testing)
- Config Server (optional for local testing)

## Create the database

```sql
CREATE DATABASE flipkart_order_db;
```

## Configuration

The default configuration is in `src/main/resources/application.yml`. Set credentials through environment variables when possible:

- `DB_URL` (default `jdbc:mysql://localhost:3306/flipkart_order_db`)
- `DB_USERNAME` (default `root`)
- `DB_PASSWORD` (default `root`)
- `REDIS_HOST` (default `localhost`)
- `REDIS_PORT` (default `6379`)
- `EUREKA_URL` (default `http://localhost:8761/eureka/`)
- `CONFIG_SERVER_URL` (default `http://localhost:8888`)

Config Server import is optional, so the service can start without a Config Server. For the complete Eureka/Redis/DB setup, those services still need to be running.

## Run

```bash
mvn spring-boot:run
```

Default port: `8084`.

## REST endpoints

### Create an order

`POST http://localhost:8084/api/orders`

```json
{
  "customerId": 101,
  "productId": 501,
  "quantity": 2,
  "unitPrice": 799.00
}
```

The service calls Inventory Service synchronously before saving the order. The starter Feign contract expects:

`GET http://inventory-service/api/inventory/{productId}`

Response:

```json
{
  "productId": 501,
  "availableQuantity": 10
}
```

**Align this URL and response DTO with your actual Inventory Service API before running order creation.** The inventory client uses Eureka service name `inventory-service`.

### Get one order

`GET http://localhost:8084/api/orders/{orderId}`

### Get all orders

`GET http://localhost:8084/api/orders`

### Health

`GET http://localhost:8084/actuator/health`

## Request flow

1. Client sends `POST /api/orders`.
2. Controller validates the request.
3. Order Service calls Inventory Service with OpenFeign and waits for the response.
4. If stock is sufficient, Order Service calculates the total and saves the order in MySQL.
5. The saved order response is returned to the client.
6. `GET /api/orders/{id}` can use Redis cache.

This starter does not yet implement payment, shipment, Kafka events, authentication, or distributed transactions. These can be added in later services/iterations.
