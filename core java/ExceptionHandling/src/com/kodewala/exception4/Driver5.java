package com.kodewala.exception4;

import java.io.IOException;

public class Driver5 {
	public static void main(String[] args) {

		System.out.println("program START");

		Test test = new Test();

		int[] arr = { 10, 20, 30 };

		String str = null;

		try {
			try {
				System.out.println(arr[5]);
			} catch (ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
			}

			try {
				System.out.println(str.length());
			} catch (NullPointerException e) {
				e.printStackTrace();
			}

			test.checkAge(15);

			test.readFile();
		}

		catch (InvalidAgeOneException e) {
			e.printStackTrace();
		}

		catch (IOException e) {
			e.printStackTrace();
		}
		
		finally {
			System.out.println("finally block executed");
		}
		
		System.out.println("program ENDED");
	}
}
