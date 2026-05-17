package com.kodewala.collection2;

import java.util.ArrayList;

public class Driver {
	public static void main(String[] args) {
		
		ArrayList<String> language = new ArrayList<String>();
		
		language.add("JAVA");
		language.add("Python");
		language.add("javaScript");
		language.add("CPP");
	
		System.out.println(language);
		
		language.add(2, "C");
		System.out.println(language);
		
		
		language.remove(1);
		System.out.println(language);
		
	}
}
