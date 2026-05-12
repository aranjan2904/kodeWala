package com.kodewala.exception3;

public class Unchecked4 {
	public static void main(String[] args) {
		
		String num = "abc";
		
		int value = 0;
		
		try {
			value = Integer.parseInt(num);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		
		System.out.println(value);
	}
}
