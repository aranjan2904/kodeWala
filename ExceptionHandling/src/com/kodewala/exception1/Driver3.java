package com.kodewala.exception1;

public class Driver3 {

	public static void main(String[] args) {

		System.out.println("Program STARTED");

		int[] arr = {10, 20, 30};

		String str = "abc";

		try {

			System.out.println("Before array access");

			System.out.println(arr[5]);

			System.out.println("After array access");

		} 
		catch (ArrayIndexOutOfBoundsException e) {

			e.printStackTrace();

			System.out.println("Invalid array index...");
		}

		try {

			System.out.println("Before conversion");

			int number = Integer.parseInt(str);

			System.out.println(number);

			System.out.println("After conversion");

		} 
		catch (NumberFormatException e) {

			e.printStackTrace();

			System.out.println("String cannot be converted into number...");
		}

		System.out.println("Program ENDED");
	}
}