package com.blinkit.orderpayment.kafka;

import java.math.BigDecimal;

public class OrderCreatedEvent {
	
	private Long orderId;
	private Long customerId;
	private BigDecimal price;
	
	
	public OrderCreatedEvent() {
		
	}


	public OrderCreatedEvent(Long orderId, Long customerId, BigDecimal price) {
		super();
		this.orderId = orderId;
		this.customerId = customerId;
		this.price = price;
	}


	public Long getOrderId() {
		return orderId;
	}


	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}


	public Long getCustomerId() {
		return customerId;
	}


	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}


	public BigDecimal getPrice() {
		return price;
	}


	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	
}
