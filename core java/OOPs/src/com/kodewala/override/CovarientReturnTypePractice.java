package com.kodewala.override;

class Parent2 {
	CommonReply doStuff(String name, int id) {
		System.out.println("doing stuff with parameter");
		return new CommonReply("Thanks everyone");
	}
}

class Child2 extends Parent2 {
	@Override
	protected InstaReply doStuff(String name, int id) {
		System.out.println("doing stuff with parameter in child class");
		return new InstaReply("abhishek", 453);
	}
}

public class CovarientReturnTypePractice {
	public static void main(String[] args) {

	}
}
