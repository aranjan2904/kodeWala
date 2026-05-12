package com.kodewala.exception1;

public class Driver6 {

	public static void main(String[] args) {

		System.out.println("Program STARTED");

		String name = "Java";

		int number1 = 100;
		int number2 = 0;

		try {

			System.out.println("Outer try block");

			try {

				System.out.println("Before char access");

				System.out.println(name.charAt(10));

			} 
			catch (StringIndexOutOfBoundsException e) {

				e.printStackTrace();

				System.out.println("Invalid string index...");
			}

			try {

				System.out.println("Before division");

				int result = number1 / number2;

				System.out.println(result);

			} 
			catch (ArithmeticException e) {

				e.printStackTrace();

				System.out.println("Cannot divide by zero...");
			}

		} 
		catch (Exception e) {

			e.printStackTrace();

			System.out.println("Parent exception handled...");
		}

		System.out.println("Program ENDED");
	}
}