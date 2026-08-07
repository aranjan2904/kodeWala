package com.eatclub.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eatclub.dao.OrderDAO;
import com.eatclub.entity.Order;

@Service
public class OrderServiceImpl implements OrderService {

    private OrderDAO orderDAO;

    public OrderServiceImpl(OrderDAO orderDAO) {
        this.orderDAO = orderDAO;
    }

    @Override
    @Transactional
    public Long placeOrder(Order order) {

        return orderDAO.saveOrder(order);
    }
}