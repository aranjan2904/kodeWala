# Zepto Order Service V2
Simple Spring Boot Order Service for Kafka practice.

Dependencies:
- Spring Web
- Spring Data JPA
- MySQL Driver
- Lombok

Lombok is included but NOT used in Java code, so Eclipse Lombok setup cannot cause compile errors.

APIs:
POST /api/orders
GET /api/orders
GET /api/orders/{id}
GET /api/orders/user/{userId}
PUT /api/orders/{id}/cancel

Example POST body:
{"userId":101,"productName":"Milk","quantity":2,"totalAmount":120.00}

MySQL database: zepto_order_db
Change username/password in application.properties.

Kafka will be added only after this CRUD service runs successfully.
