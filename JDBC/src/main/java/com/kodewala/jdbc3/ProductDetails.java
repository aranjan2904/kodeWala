package com.kodewala.jdbc3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductDetails {

	public void insertProductDetails() throws ClassNotFoundException, SQLException, IOException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/kodewala", "root",
				"Shubham@2904");

		try {
			connection.setAutoCommit(false);

			String query = "insert into product(id,name,price,quantity) values(?,?,?,?)";

			PreparedStatement ps = connection.prepareStatement(query);

			BufferedReader br = new BufferedReader(new FileReader(
					"C:\\Users\\aranj\\Desktop\\kodewala\\JDBC\\src\\main\\java\\com\\kodewala\\jdbc3\\product.csv"));

			br.readLine();

			String line;

			int count = 0;

			while ((line = br.readLine()) != null) {

				String data[] = line.split(",");

				ps.setInt(1, Integer.parseInt(data[0]));
				ps.setString(2, data[1]);
				ps.setDouble(3, Double.parseDouble(data[2]));
				ps.setInt(4, Integer.parseInt(data[3]));

				ps.addBatch();

				count++;

			}

			if (count % 5 == 0) {

				int[] insertedBatch = ps.executeBatch();

				System.out.println("Batch inserted" + insertedBatch);
			}

			ps.executeBatch();

			connection.commit();

			ps.close();
			br.close();
			connection.close();
		} catch (NumberFormatException | SQLException | IOException e) {

			connection.rollback();

			e.printStackTrace();
		}
	}

	public void updateProductDetail(int quantity, int id) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/kodewala", "root",
				"Shubham@2904");

		String updateQuery = "update product set quantity = ? where id = ?";

		PreparedStatement ps = connection.prepareStatement(updateQuery);

		ps.setInt(1, quantity);
		ps.setInt(2, id);

		int result = ps.executeUpdate();

		if (result > 0) {
			System.out.println("product updated");
		} else {
			System.out.println("failed to update");
		}

	}

	
	public void deleteProductDetail(int id) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/kodewala", "root",
				"Shubham@2904");

		String deleteQuery = "delete from product where id = ?";
		
		PreparedStatement ps = connection.prepareStatement(deleteQuery);
		
		ps.setInt(1, id);
		
		int deleteResult = ps.executeUpdate();
		
		if(deleteResult > 0) {
			System.out.println("data deleted");
		}else {
			System.out.println("failed data");
		}
		
	}
}
