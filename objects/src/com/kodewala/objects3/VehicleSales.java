package com.kodewala.objects3;

class Vehicle {
	String brand;
	
	Vehicle(String _brand){
		this.brand = _brand;
	}
}

class Car extends Vehicle{
	String model;
	String colour;
	int door;
	
	public Car(String _brand,String _model, String _colour) {
		this(_brand,_model, _colour, 4);
	}
	
	public Car(String _brand,String _model, String _colour, int _door) {
		super(_brand);
		this.model = _model;
		this.colour = _colour;
		this.door = _door;
		
	}
	
	void display(){
		System.out.println(brand);
		System.out.println(model);
		System.out.println(colour);
		System.out.println(door);
	}
	
}

public class VehicleSales {
	public static void main(String[] args) {
		Car car = new Car("Maruti","Brezza","white");
		car.display();
	}
}
