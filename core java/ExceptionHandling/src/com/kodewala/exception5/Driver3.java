package com.kodewala.exception5;

public class Driver3 {
	public static void main(String[] args) {
		String n = null;
		try {
			System.out.println(n.length());
		}
		catch(ArrayIndexOutOfBoundsException | NullPointerException | NumberFormatException e) {
			e.printStackTrace();
		}
	}
}
