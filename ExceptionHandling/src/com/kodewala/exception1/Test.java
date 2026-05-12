package com.kodewala.exception1;

public class Test {
	public static void main(String[] args) {
		
		System.out.println("progarm START");
		
		
		int number1 = 45;
		int number2 = 0;
		String str = null;
		
		try {
			System.out.println("Before division");
			
			int division =  number1 / number2;
			System.out.println(division);
			
			System.out.println("After division");
	
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("number2 is Zero...");
		}
		
		
		try {
			System.out.println("String length is : " + str.length());

		}
		catch(NullPointerException e) {
			e.printStackTrace();
			System.out.println("str is null...");
		}
		
		
		
		System.out.println("Program ENDED");
	}
}
