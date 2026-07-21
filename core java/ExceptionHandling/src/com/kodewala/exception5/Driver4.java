package com.kodewala.exception5;

public class Driver4 {

	public static void main(String[] args) {

		String arr[] = {"10", "20"};

		try {

			int number = Integer.parseInt(arr[5]);

			System.out.println(number);

		}
		catch (ArrayIndexOutOfBoundsException 
				| NumberFormatException 
				| NullPointerException e) {

			e.printStackTrace();
		}
	}
}