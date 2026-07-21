package com.kodewala.array1;

class Bag {
	void getItem() {
	String item[] = new String[5];
	
	item[0] = "Smart Phone";
	item[1] = "Laptop";
	item[2] = "Tablet";
	item[3] = "Notebook";
	item[4] = "Charger";
	
	
	for(int index = 0; index<item.length; index++) {
		String currentItem = item[index];
		
		if(currentItem.startsWith("L")){
			continue;
			
		}
		System.out.println(currentItem);
	}
}
}
public class Product {
	public static void main(String[] args) {
		Bag bag = new Bag();
		bag.getItem();
	}
}
