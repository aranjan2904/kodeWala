package com.zepto.orderservice.kafka;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaConfig {
	
	@Bean
	public NewTopic OrderCreatedTopic() {
		
		return new NewTopic("Order_Created", 1, (short)1);
	}

}
