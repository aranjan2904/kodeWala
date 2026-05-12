package com.kodewala.interface7;

interface ICheck {
	String check(int number);
}

public class EvenOrOdd {
	public static void main(String[] args) {
		
		ICheck check =  (int number) -> 
		{
			if(number % 2 == 0) {
				return "Even";
			}else {
				return "Odd";
			}
		};
		System.out.println(check.check(45));
	}
}
