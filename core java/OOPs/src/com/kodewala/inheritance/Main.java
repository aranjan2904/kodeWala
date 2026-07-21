package com.kodewala.inheritance;

class Animal1 {
	void sound() {
		System.out.println("Animal sound");
	}
	void walk() {
		System.out.println("walking");
	}
}

class Dog1 extends Animal1 {
	void sound() {
		System.out.println("Dog sound");
	}
	void bark() {
		System.out.println("bark bark");
	}
}

public class Main {
	public static void main(String[] args) {
		Animal1 animal = new Dog1();
		animal.sound();
		animal.walk();
		
		Dog1 dog = (Dog1) animal;
		dog.bark();
		
	}
}
