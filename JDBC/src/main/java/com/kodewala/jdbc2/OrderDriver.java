package com.kodewala.jdbc2;

import java.sql.SQLException;

public class OrderDriver {
	public static void main(String[] args) {
		
		OrderService order = new OrderService();
		
		try {
			order.placeOrder();
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
	}
}
