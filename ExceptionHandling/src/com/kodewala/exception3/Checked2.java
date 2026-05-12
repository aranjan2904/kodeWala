package com.kodewala.exception3;

public class Checked2 {
	public static void main(String[] args) {
		
		try {
			Class.forName("com.kodewala.exception3.Checked1");
		}
		catch(ClassNotFoundException e) {
			System.out.println("class not found");
		}
	}
}
