package com.ownly.order.repository;

import org.springframework.data.repository.CrudRepository;

import com.ownly.order.entity.OrderEntity;

public interface OrderRepository extends CrudRepository<OrderEntity, Integer> {

}
