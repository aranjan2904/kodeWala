package com.kodewala.exception1;

public class Driver5 {

	public static void main(String[] args) {

		System.out.println("Program STARTED");

		String str = null;

		String number = "abc";

		try {

			System.out.println("Outer try block");

			try {

				System.out.println("Before string length");

				System.out.println(str.length());

			} 
			catch (NullPointerException e) {

				e.printStackTrace();

				System.out.println("String is null...");
			}

			try {

				System.out.println("Before conversion");

				int value = Integer.parseInt(number);

				System.out.println(value);

			} 
			catch (NumberFormatException e) {

				e.printStackTrace();

				System.out.println("Invalid number format...");
			}

		} 
		catch (Exception e) {

			e.printStackTrace();

			System.out.println("Parent exception handled...");
		}

		System.out.println("Program ENDED");
	}
}