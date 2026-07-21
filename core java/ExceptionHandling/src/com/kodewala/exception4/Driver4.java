package com.kodewala.exception4;

public class Driver4 {
	public static void main(String[] args) {
		
		System.out.println("program START");
		
		int number1 = 50;
		int number2 = 0;
		
		int[] arr = {10,20,30};
		
		String str = null;
		
		try {
			System.out.println("Before Division");
			
			int result = number1 / number2;
			System.out.println(result);
			
			System.out.println(arr[5]);
			
			System.out.println(str.length());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("invalid arrar index");
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("cannot divide by zero");
		}
		catch(NullPointerException e) {
			e.printStackTrace();
			System.out.println("cannot be null");
		}
		
		finally {
			System.out.println("finnaly block executed");
		}
		System.out.println("program ENDED");
	}
}
