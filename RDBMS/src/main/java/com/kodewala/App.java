package com.kodewala;

import java.sql.SQLException;

public class App 
{
    public static void main( String[] args )
    {
       PaymentService payment = new  PaymentService();
       try {
		payment.getAllPayment("paid");
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    }
}
