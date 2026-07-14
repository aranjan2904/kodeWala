package com.kodewala.jdbc2;

import java.sql.SQLException;

public class BankingDriver {
	public static void main(String[] args) {
		BankingService banking = new BankingService();
		
		try {
			banking.doTransfer();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
