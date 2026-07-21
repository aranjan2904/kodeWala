package com.kodewala.exception1;

public class Driver7 {

	public static void main(String[] args) {

		System.out.println("Program STARTED");

		int[] arr = {10, 20, 30};

		String str = null;

		try {

			System.out.println("Outer try block");

			try {

				System.out.println("Before array access");

				System.out.println(arr[10]);

			} 
			catch (ArrayIndexOutOfBoundsException e) {

				e.printStackTrace();

				System.out.println("Invalid array index...");
			}

			try {

				System.out.println("Before string operation");

				System.out.println(str.toUpperCase());

			} 
			catch (NullPointerException e) {

				e.printStackTrace();

				System.out.println("String is null...");
			}

		} 
		catch (Exception e) {

			e.printStackTrace();

			System.out.println("Parent exception handled...");
		}

		System.out.println("Program ENDED");
	}
}