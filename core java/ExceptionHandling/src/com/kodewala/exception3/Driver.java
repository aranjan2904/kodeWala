package com.kodewala.exception3;

public class Driver {

	public static void main(String[] args) {

		String name = "";

		System.out.println(name.length());

		try {

			Class.forName("com.kodewala.exception3.Driver");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


