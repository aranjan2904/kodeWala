package com.kodewala.exception2;

class Test {
	int number1 = 56;
	int number2 = 0;

	public void doDivide() {
		
		try {
			
			int result = number1 / number2;
			
		} 
		catch (ArithmeticException e) {
			
			e.printStackTrace();
			System.out.println("connot divided by zero");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}

public class Driver {
	public static void main(String[] args) {
		
		Test test = new Test();
		test.doDivide();
	}
}
