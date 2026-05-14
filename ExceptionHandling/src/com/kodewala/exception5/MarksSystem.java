package com.kodewala.exception5;

import java.io.BufferedReader;
import java.io.FileReader;

public class MarksSystem {
	public static void main(String[] args) {
		
		Student student = new Student(45, "aryan", 86);
		
		int count = 0;
		
		try(BufferedReader br = new BufferedReader(new FileReader(""))){
			
			String line;
			
			while((line = br.readLine())  != null) {
				
				String arr[] = line.split(",");
				
				int rollNo = Integer.parseInt(arr[0]);
				
				String name = arr[1];
				
				int marks = Integer.parseInt(arr[2]);
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
