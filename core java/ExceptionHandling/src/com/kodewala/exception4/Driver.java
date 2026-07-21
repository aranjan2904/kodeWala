package com.kodewala.exception4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Driver {
	public static void main(String[] args) throws IOException {

		System.out.println("program start");
		BufferedReader br = null;
		

		try {
			System.out.println("try start");
			
			br = new BufferedReader(
					new FileReader("C:\\Users\\aranj\\Desktop\\kodewala\\ExceptionHandling\\src\\com\\kodewala\\exception4\\data.txt"));
			
			System.out.println("try end ");
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("file not found");
		}
		catch (Exception e) {
			e.printStackTrace();
		} 
		finally {
			br.close();
			System.out.println("finally block executed");
		}
	}
}