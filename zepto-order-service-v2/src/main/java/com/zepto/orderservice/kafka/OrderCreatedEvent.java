package com.zepto.orderservice.kafka;

import java.math.BigDecimal;


public class OrderCreatedEvent {
	
	    private Long orderId;
	    private Long userId;
	    private String productName;
	    private Integer quantity;
	    private BigDecimal totalAmount;
	    
	    
	    
		public OrderCreatedEvent() {
			
		}
		
		
		public OrderCreatedEvent(Long orderId, Long userId, String productName, Integer quantity,
				BigDecimal totalAmount) {
			super();
			this.orderId = orderId;
			this.userId = userId;
			this.productName = productName;
			this.quantity = quantity;
			this.totalAmount = totalAmount;
		}
		public Long getOrderId() {
			return orderId;
		}
		public void setOrderId(Long orderId) {
			this.orderId = orderId;
		}
		public Long getUserId() {
			return userId;
		}
		public void setUserId(Long userId) {
			this.userId = userId;
		}
		public String getProductName() {
			return productName;
		}
		public void setProductName(String productName) {
			this.productName = productName;
		}
		public Integer getQuantity() {
			return quantity;
		}
		public void setQuantity(Integer quantity) {
			this.quantity = quantity;
		}
		public BigDecimal getTotalAmount() {
			return totalAmount;
		}
		public void setTotalAmount(BigDecimal totalAmount) {
			this.totalAmount = totalAmount;
		}

}
