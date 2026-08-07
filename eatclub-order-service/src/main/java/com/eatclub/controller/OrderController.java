package com.eatclub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.eatclub.entity.Order;
import com.eatclub.request.OrderRequest;
import com.eatclub.service.OrderService;

@Controller
public class OrderController {

    private OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("placeOrder")
    public String placeOrder(@ModelAttribute OrderRequest orderRequest,
                             Model model) {

        // Convert OrderRequest into Order entity
        Order order = new Order(
                orderRequest.getCustomerName(),
                orderRequest.getItem(),
                orderRequest.getQuantity(),
                orderRequest.getAddress(),
                orderRequest.getPayment()
        );

        // Save order using Hibernate
        // Hibernate/MySQL will generate the booking ID
        Long bookingId = orderService.placeOrder(order);

        // Send booking ID to confirmation JSP
        model.addAttribute("bookingId", bookingId);

        // Send order details to confirmation JSP
        model.addAttribute("customerName", orderRequest.getCustomerName());
        model.addAttribute("item", orderRequest.getItem());
        model.addAttribute("quantity", orderRequest.getQuantity());
        model.addAttribute("address", orderRequest.getAddress());
        model.addAttribute("payment", orderRequest.getPayment());

        return "confirm-order";
    }
}