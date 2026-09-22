package com.blinkit.orderpayment.kafka;

import java.math.BigDecimal;

public class OrderCreatedEvent {
	
	private Long orderId;
	private Long customerId;
	private BigDecimal amount;
	
	
	public OrderCreatedEvent() {
		
	}


	public OrderCreatedEvent(Long orderId, Long customerId, BigDecimal amount) {
		super();
		this.orderId = orderId;
		this.customerId = customerId;
		this.amount = amount;
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


	public BigDecimal getAmount() {
		return amount;
	}


	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	
	
}
