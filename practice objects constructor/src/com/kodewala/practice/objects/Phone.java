package com.kodewala.practice.objects;

class Mobile{
	String brand;
	
	public Mobile(String _brand) {
		this.brand = _brand;
	}
}

class SmartPhone extends Mobile{
	String model;
	double price;
	
	public SmartPhone(String _brand, String _model) {
		this(_brand,_model,12000);
		
	}
	
	public SmartPhone(String _brand, String _model, double _price) {
		super(_brand);
		this.model = _model;
		this.price = _price;
	}
	
	void display(){
		System.out.println("Brand: "+brand);
		System.out.println("Model: "+model);
		System.out.println("Price: "+price);
	}
}

public class Phone {
	public static void main(String[] args) {
		SmartPhone smtphone = new SmartPhone("Redme","Note 7 pro" );
		smtphone.display();
	}
}
