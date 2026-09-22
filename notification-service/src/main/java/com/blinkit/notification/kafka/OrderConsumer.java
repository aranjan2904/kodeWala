package com.blinkit.notification.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrderConsumer {
	
	@KafkaListener(topics = "Order_Created", groupId = "notification-group")
	public void consumeOrderCreatedEvent(OrderCreatedEvent event) {
		
		System.out.println("-----------------------------");
		
		System.out.println("NEW ORDER RECEIVED");
		
		System.out.println("Order Id: "+ event.getOrderId());
		System.out.println("Customer Id: " + event.getCustomerId());
		System.out.println("Amount: " + event.getAmount());
		
		
		
		System.out.println("---------------------------------");
		
	}
	

}
