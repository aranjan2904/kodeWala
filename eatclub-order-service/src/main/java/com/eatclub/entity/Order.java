package com.eatclub.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bookingId;
	private String customerName;
	private String item;
	private int quantity;
	private String address;
	private String payment;
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(String customerName, String item, int quantity,
            String address, String payment) {

   this.customerName = customerName;
   this.item = item;
   this.quantity = quantity;
   this.address = address;
   this.payment = payment;
}

	public Long getBookingId() {
		return bookingId;
	}

	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	@Override
	public String toString() {
		return "Order [bookingId=" + bookingId + ", customerName=" + customerName + ", item=" + item + ", quantity="
				+ quantity + ", address=" + address + ", payment=" + payment + "]";
	}
	
	
	

}
