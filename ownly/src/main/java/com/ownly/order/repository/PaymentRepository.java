package com.ownly.order.repository;

import org.springframework.data.repository.CrudRepository;

import com.ownly.order.entity.PaymentEntity;

public interface PaymentRepository extends CrudRepository<PaymentEntity, Integer>{

}
