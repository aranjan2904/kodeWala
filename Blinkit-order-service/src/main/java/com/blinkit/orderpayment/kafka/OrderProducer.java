package com.blinkit.orderpayment.kafka;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class OrderProducer {
	
	private final KafkaTemplate<String, OrderCreatedEvent> kafkaTemplate;

	public OrderProducer(KafkaTemplate<String, OrderCreatedEvent> kafkaTemplate) {
		super();
		this.kafkaTemplate = kafkaTemplate;
	}
	
	public void sendOrderCreatedEvent(OrderCreatedEvent event) {
		
		kafkaTemplate.send("Order_Created",event.getOrderId().toString(), event);
		
		System.out.println("Order Created event sent to Kafka: " + event.getOrderId() );
		
		

	}

}
