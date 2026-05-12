package com.kodewala.exception4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FoodDeliveryApp {
	public static void main(String[] args) {
		
		BufferedReader br = null;
		
		try {
			FileReader fr = new FileReader("C:\\Users\\aranj\\Desktop\\kodewala\\ExceptionHandling\\src\\com\\kodewala\\exception4\\order.txt");
			
			br = new BufferedReader(fr);
			
			String line;
			
			System.out.println("customer order Details");
			
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
			
			System.out.println();
			
			FoodDelivery f = new FoodDelivery();
			
			f.orderFood(300);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				if(br != null) {
					br.close();
				}
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
