package com.eatclub.dao;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.eatclub.entity.Order;

@Repository
public class OrderDAOImpl implements OrderDAO {

    private SessionFactory sessionFactory;

    public OrderDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Long saveOrder(Order order) {

        sessionFactory
            .getCurrentSession()
            .persist(order);

        return order.getBookingId();
    }
}