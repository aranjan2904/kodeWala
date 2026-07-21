package com.ecommerce.model;

import java.sql.Timestamp;

public class Order {

    private int orderId;
    private int customerId;
    private double totalAmount;
    private String status;
    private Timestamp createdAt;

  
	public Order() {
    }

    public Order(int customerId, double totalAmount, String status) {
        this.customerId = customerId;
        this.totalAmount = totalAmount;
        this.status = status;
    } 

    public Order(int orderId, int customerId, double totalAmount, String status) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.totalAmount = totalAmount;
        this.status = status;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public Timestamp getCreatedAt() {
  		return createdAt;
  	}

  	public void setCreatedAt(Timestamp createdAt) {
  		this.createdAt = createdAt;
  	}


}