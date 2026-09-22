# Blinkit Order + Payment Microservice

A small **Blinkit-style order microservice** built to learn:

- Spring Web
- Spring Data JPA
- MySQL
- Lombok
- REST APIs
- Service layer
- `@Transactional`
- Payment processing
- Database rollback

## Architecture

```text
Client
  |
  v
OrderController
  |
  v
OrderService (@Transactional)
  |
  +----> OrderRepository ----> MySQL
  |
  +----> PaymentService
              |
              +----> PaymentRepository ----> MySQL
```

The important concept is that the order and payment are handled inside the **same database transaction**.

## 1. Create the database

You can let Hibernate create it automatically because the JDBC URL contains:

```text
createDatabaseIfNotExist=true
```

Or create it manually:

```sql
CREATE DATABASE blinkit_db;
```

## 2. Configure MySQL

Open:

```text
src/main/resources/application.properties
```

Change:

```properties
spring.datasource.username=root
spring.datasource.password=YOUR_MYSQL_PASSWORD
```

## 3. Run

```bash
mvn spring-boot:run
```

Server:

```text
http://localhost:8081
```

## 4. Test successful payment

POST:

```text
POST http://localhost:8081/api/orders
Content-Type: application/json
```

Body:

```json
{
  "customerId": 101,
  "amount": 499.00,
  "paymentSuccess": true
}
```

Expected result:

```json
{
  "orderId": 1,
  "customerId": 101,
  "amount": 499.00,
  "status": "CONFIRMED",
  "message": "Order created and payment successful"
}
```

Check MySQL:

```sql
SELECT * FROM orders;
SELECT * FROM payments;
```

You should see one order and one successful payment.

## 5. Test rollback

Send:

```json
{
  "customerId": 102,
  "amount": 799.00,
  "paymentSuccess": false
}
```

PaymentService throws:

```java
throw new PaymentFailedException(...)
```

Because this is a `RuntimeException` and the method is:

```java
@Transactional
public OrderResponse createOrder(...)
```

Spring rolls back the transaction.

That means the order that was temporarily inserted is also rolled back.

Response:

```json
{
  "error": "PAYMENT_FAILED",
  "message": "Payment failed for order 2",
  "rollback": "Order transaction rolled back"
}
```

Then run:

```sql
SELECT * FROM orders;
SELECT * FROM payments;
```

The failed order should **not exist** in the database.

## Important interview concept

The flow is:

```text
BEGIN TRANSACTION

Save Order
      |
      v
Process Payment
      |
      +---- SUCCESS ----> Update Order = CONFIRMED
      |
      +---- FAILURE ----> RuntimeException
                              |
                              v
                         ROLLBACK
                              |
                    Order insert is undone

COMMIT only when everything succeeds
```

## Important limitation

This project demonstrates **database transaction rollback**.

In a real Blinkit-like microservices system, `order-service` and `payment-service` are normally separate services with separate databases. A normal `@Transactional` transaction cannot roll back a remote service/database transaction.

For real distributed transactions, you would normally learn:

- Saga pattern
- Choreography
- Orchestration
- Kafka events
- Outbox pattern
- Idempotency
- Compensation / refund

This project intentionally keeps order + payment in one service/database first so the transaction and rollback concept is easy to understand.
