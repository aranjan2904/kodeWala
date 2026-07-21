package com.kodewala.override;

class Parent1 {
	 void doStuff(String name, int age ) {
		System.out.println("doing stuff with parameter");
	}
}

class Child1 extends Parent1{
	@Override
	protected void doStuff(String name, int age) {  
		System.out.println("doing stuff with parameter in child class");
	}
}

//access modifier should be same or wider
//return type must be same
//parameter must be same in order,type and number

public class playWithOverride {
	public static void main(String[] args) {
		Child1 child = new Child1();
	}
}
