package com.kodewala.exception1;

public class Driver2 {

	public static void main(String[] args) {

		System.out.println("Program STARTED");

		String name = "Java";

		String str = null;

		try {

			System.out.println("Before character access");

			System.out.println(name.charAt(10));

			System.out.println("After character access");

		} 
		catch (StringIndexOutOfBoundsException e) {

			e.printStackTrace();

			System.out.println("Invalid string index...");
		}

		try {

			System.out.println("Before string length");

			System.out.println(str.length());

			System.out.println("After string length");

		} 
		catch (NullPointerException e) {

			e.printStackTrace();

			System.out.println("String is null...");
		}

		System.out.println("Program ENDED");
	}
}