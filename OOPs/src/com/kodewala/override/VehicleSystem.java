package com.kodewala.override;

class EngineStart {
	void start() {
		System.out.println("Turn the key on");
		System.out.println("press start button");
	}
}

class Bike extends EngineStart {
	void start() {
		System.out.println("Turn the key on");
		System.out.println("press Clutch");
		System.out.println("press start button");
	}
}

class Scooty extends EngineStart{
	void start() {
		System.out.println("Turn the key on");
		System.out.println("Press Break");
		System.out.println("press start button");
	}
}

public class VehicleSystem {
	public static void main(String[] args) {
		
		//Bike bike = new Bike();
		//bike.start();
		
		Scooty scooty = new Scooty();
		scooty.start();
		
	}
}
