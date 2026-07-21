package com.kodewala.override;

class Parent {
	void buyPhone() {
		System.out.println("i will buy you a Android phone");
	}
}

class Child extends Parent{
	void buyPhone() {
		System.out.println("i will buy myself a iphone only somehow!!!");
	}
}

public class MobileSystem {
	public static void main(String[] args) {
		Child child = new Child();
		child.buyPhone();
	}
}
