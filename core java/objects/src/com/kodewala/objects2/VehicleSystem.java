package com.kodewala.objects2;

class Vehicle{
	String brand;
	double speed;
	
	Vehicle(String _brand, double _speed){
		this.brand = _brand;
		this.speed = _speed;
		System.out.println("Vehicle with brand and speed"+ brand + speed);
	}
	
	Vehicle(String _brand){
		this.brand = _brand;
		System.out.println("Vehicle with brand");
	}
	
	Vehicle(){
		
		System.out.println("Vehicle with no parameter");
	}
	
	
	
		
}
//main constructor
class Car extends Vehicle {
	int door;
	String fuelType;
	
	//main constructor
	Car(String _brand, double _speed, int _door, String _fuelType){
		super(_brand, _speed);
		this.door = _door;
		this.fuelType = _fuelType;
		System.out.println("car with all brand speed door fueltype "+brand + speed + door + fuelType);
	}
	
	
	//
	Car(String _brand, int _door){
		this(_brand);
		//super(_brand);
		//this.brand = _brand;
		this.door = _door;
		System.out.println("Car with brand and door "+ brand +door);
	}
	
	Car(String _brand){
		//this(_brand);
		super(_brand);
		//this.brand = _brand;
		System.out.println("car with only brand "+brand);
	}
	
	Car(){
		this("BMW");
	}
}

public class VehicleSystem {
	public static void main(String[] args) {
		
		System.out.println("car created car1----------");
		Car car1 = new Car("Audi",120,4,"petrol");
		
		System.out.println("Car created car2:---------------");
		Car car2 = new Car("Toyota",6);
		
		System.out.println("car created car3:----------------");
		Car car3 = new Car("Mercadies");

		
		System.out.println("car created car4:----------------");
		Car car4 = new Car();

		
	}
}
