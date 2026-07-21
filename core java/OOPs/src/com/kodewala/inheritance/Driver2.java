package com.kodewala.inheritance;

class Vehicle1 {
	int door = 4;
}

class Car1 extends Vehicle1 {
	String colour = "Black";
	
	void display(){
		System.out.println("Door: " + door + "  " + "colour: " + colour);
	}
}

public class Driver2 {
	public static void main(String[] args) {
		Car1 car = new Car1();
		car.display();
	}
}
