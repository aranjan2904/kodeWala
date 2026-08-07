package com.eatclub.service;

import com.eatclub.entity.Order;

public interface OrderService {

    Long placeOrder(Order order);
}