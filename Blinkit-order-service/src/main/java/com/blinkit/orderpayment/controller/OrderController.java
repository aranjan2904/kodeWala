package com.blinkit.orderpayment.controller;

import com.blinkit.orderpayment.dto.CreateOrderRequest;
import com.blinkit.orderpayment.dto.OrderResponse;
import com.blinkit.orderpayment.entity.Order;
import com.blinkit.orderpayment.repository.OrderRepository;
import com.blinkit.orderpayment.service.OrderService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;
    private final OrderRepository orderRepository;
    
    

    public OrderController(OrderService orderService, OrderRepository orderRepository) {
		super();
		this.orderService = orderService;
		this.orderRepository = orderRepository;
	}

	@PostMapping
    public ResponseEntity<OrderResponse> createOrder(
            @Valid @RequestBody CreateOrderRequest request) {

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(orderService.createOrder(request));
    }

    @GetMapping
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }
}
