package com.kodewala.jdbc3;

import java.io.IOException;
import java.sql.SQLException;

public class ProductDriver {
	public static void main(String[] args) {
		
		ProductDetails product = new ProductDetails();
		
//		try {
//			product.insertProductDetails();
//		} catch (ClassNotFoundException | SQLException | IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		try {
			product.updateProductDetail(1000, 101);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
