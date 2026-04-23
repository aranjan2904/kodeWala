package com.kodewala.polymorphism;

class Vehicle {
	void start() {
		System.out.println("vehicle is starting");
	}
}

class Car extends Vehicle {
	void playMusic() {
		System.out.println("playing music in car");
	}
}

class Bike extends Vehicle{
	void doWheelie() {
		System.out.println("bike is doing wheelie");
	}
}

public class VehicleSystem {
	public static void main(String[] args) {
		
		//Vehicle v = new Car(); //upcasting
		
		//v.start(); //allowed
		
		// v.playMusic();   not allowed
		
		
		//Car c = (Car) v; //downcasting
		//c.playMusic(); // allowed
		
		Vehicle v = new Bike();
		
		if(v instanceof Car) {
			Car c = (Car) v;
			c.playMusic();
		}else {
			System.out.println("Not a car object");
		}
		
	}
}
