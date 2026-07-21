package com.kodewala.inheritance;

class Animal2{
	void eat() {
		System.out.println("Animal eating");
	}
}

class Dog2 extends Animal2{
	void bark() {
		System.out.println("Dog barking");
	}
}

public class Driver3 {
	public static void main(String[] args) {
		Dog2 dog = new Dog2();
		dog.eat();
		dog.bark();
	}
}
