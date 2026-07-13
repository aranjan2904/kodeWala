package com.kodewala.jdbc1;

import java.sql.SQLException;

public class App 
{
    public static void main( String[] args )
    {
       PaymentService payment = new  PaymentService();
       try {
		payment.getAllPayment(null);
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       
       try {
		payment.updatePayment(1, "delululu");
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    }
}
