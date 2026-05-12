package com.kodewala.interface7;

public class Driver {
	public static void main(String[] args) {
		
		ICalc calc = (i,j) -> i * j;
		
		int mul = calc.doCal(4, 5);
		
		System.out.println(mul);
	}
}
