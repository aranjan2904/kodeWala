package com.kodewala.jdbc3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDetails {
	
	public void updateStudentDetails(int id, String name, String status) throws ClassNotFoundException, SQLException {
		

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/kodewala", "root",
				"Shubham@2904");
		
		
		String updateQuery = "update student set status = ?, name = ? where id = ?";
		
		PreparedStatement ps = connection.prepareStatement(updateQuery);
		
		ps.setString(1, status);
		ps.setString(2, name);
		ps.setInt(3, id);
		
		int recordUpdate = ps.executeUpdate();
		
		if(recordUpdate > 0) {
			System.out.println("Record updated : " + recordUpdate);
		}else {
			System.err.println("unable to updata the record");
		}
		
	}
	
	public void insertStudentDetails() throws ClassNotFoundException, SQLException, IOException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/kodewala", "root",
				"Shubham@2904");
		
		
			
			try {
				connection.setAutoCommit(false);
				
				String insertQuery = "insert into student(id,name,status) values(?,?,?)";
				
				PreparedStatement ps = connection.prepareStatement(insertQuery);
				
				BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\aranj\\Desktop\\kodewala\\JDBC\\src\\main\\java\\com\\kodewala\\jdbc3\\student.csv"));
				
				br.readLine();
				
				String line;
				
				int count = 0;
				
				while((line = br.readLine()) != null) {
					
					String data[] = line.split(",");
					
					ps.setInt(1, Integer.parseInt(data[0]));
					ps.setString(2, data[1]);
					ps.setString(3, data[2]);
					
					ps.addBatch();
					
					count++;
					
					if(count % 5 == 0) {
						int[] insertresult = ps.executeBatch();
						System.out.println("Batch inserted");
					}
				}
				
				ps.executeBatch();
				
				connection.commit();
				
				ps.close();
				br.close();
				connection.close();
			} catch (NumberFormatException | SQLException | IOException e) {
				connection.rollback();
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		
	}
}
