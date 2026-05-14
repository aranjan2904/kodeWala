package com.kodewala.collection1;

import java.util.ArrayList;

public class Driver {
	public static void main(String[] args) {
		
		ArrayList<String> productList = new ArrayList<String>();  //create arrayList which store String object
		
		//adding string object to arrayList
		productList.add("SmartPhone");
		productList.add("music player");
		productList.add("speaker");
		productList.add("projector");
		productList.add("laptop");
		productList.add("SmartPhone");
		productList.add("Bag");
		productList.add("Bench");
		productList.add("Door");
		productList.add("cloth");
		
		System.out.println(productList.get(7));
		System.out.println("----------");
		
		//operation of arrayList
		for(int i = 0; i<productList.size(); i++) {
			
			String currentElement = productList.get(i); 
			
			if(currentElement.toUpperCase().startsWith("S")) {
				System.out.println(currentElement);
			}		
		}
	}

}
