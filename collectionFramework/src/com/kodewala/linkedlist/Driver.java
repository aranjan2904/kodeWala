package com.kodewala.linkedlist;

import java.util.LinkedList;

public class Driver {
	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("Daltonganj");
		list.add("Sudna");
		list.add("Redma");
		list.add("Bairiya");
		
		System.out.println(list);
		
		list.add(3,"Nimiya");
		
		System.out.println(list);
		
		list.remove("Daltonganj");
		System.out.println(list);
	}
}
