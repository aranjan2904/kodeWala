package com.kodewala.jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class OrderService {

	public void placeOrder() throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/kodewala", "root",
				"Shubham@2904");

		try {

			connection.setAutoCommit(false); 

			Statement stmt = connection.createStatement();

			// create order record

			String createOrder = "insert into orders(id, item, status) VALUES(1,'Asus Laptop', 'not set')";

			int result = stmt.executeUpdate(createOrder);

			if (result > 0) {
				System.out.println("order created");
			} else {
				System.out.println("order creation failed");
			}

			// create payment record

			String createPayment = "insert into payment(id, name, status) values(1, 'Asus Laptop', 'not set')";

			int paymentResult = stmt.executeUpdate(createPayment);

			if (paymentResult > 0) {
				System.out.println("payment record created");
			} else {
				System.out.println("payment record creation failed");
			}

			// update order table with paid

			String updateOrders = "update orders set status = 'paid' where id=1";

			int updateResult = stmt.executeUpdate(updateOrders);

			if (updateResult > 0) {
				System.out.println("order status updated");
			} else {
				System.out.println("order status update failed");
			}
			
			//update payment table with paid
			String updatePayment = "update payment set status = 'paid' where id=1";

			int updatePaymentResult = stmt.executeUpdate(updatePayment);

			if (updatePaymentResult > 0) {
				System.out.println("payment status updated");
			} else {
				System.out.println("payment status update failed");
			}

			connection.commit();

		} catch (SQLException e) {
			connection.rollback();
			e.printStackTrace();
		}

	}

	
}
