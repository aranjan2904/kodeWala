package com.kodewala.collection1;

import java.util.ArrayList;

public class Language {
	public static void main(String[] args) {

		ArrayList<String> bookList = new ArrayList<String>();

		// Adding books
		bookList.add("Java Programming");
		bookList.add("Python Basics");
		bookList.add("Data Structures");
		bookList.add("Operating System");
		bookList.add("Computer Networks");
		bookList.add("DBMS");

		
		System.out.println("Library Books:");
		System.out.println(bookList);

		System.out.println("----------------");

		bookList.add("Machine Learning");

		System.out.println("New Book List");
		System.out.println(bookList);
	}
}
