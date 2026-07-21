package com.kodewala.exception1;

public class Driver4 {

	public static void main(String[] args) {

		System.out.println("Program STARTED");

		int number1 = 50;
		int number2 = 0;

		int[] arr = {10, 20, 30};

		try {

			System.out.println("Outer try block");

			try {

				System.out.println("Before division");

				int result = number1 / number2;

				System.out.println(result);

			} 
			catch (ArithmeticException e) {

				e.printStackTrace();

				System.out.println("Cannot divide by zero...");
			}

			try {

				System.out.println("Before array access");

				System.out.println(arr[5]);

			} 
			catch (ArrayIndexOutOfBoundsException e) {

				e.printStackTrace();

				System.out.println("Invalid array index...");
			}

		} 
		catch (Exception e) {

			e.printStackTrace();

			System.out.println("Parent exception handled...");
		}

		System.out.println("Program ENDED");
	}
}