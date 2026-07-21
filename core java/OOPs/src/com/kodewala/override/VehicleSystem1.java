package com.kodewala.override;

class Vehicle2 {
	Vehicle2 start() {
		System.out.println("Vehicle Start");
		return new Vehicle2();
	}
}

class Car2 extends Vehicle2 {
	@Override
	Car2 start() {
		System.out.println("Car start with key");
		return new Car2();
	}
}

public class VehicleSystem1 {
	public static void main(String[] args) {
		Car2 car = new Car2();
		car.start();
	}
}
