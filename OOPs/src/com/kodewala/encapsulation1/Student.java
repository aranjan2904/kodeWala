package com.kodewala.encapsulation1;

 public class Student {
	private String name;
	private int roll;
	
	
	public Student(String name, int roll) {
		super();
		setName(name);
		setRoll(roll);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if (name == null || name.trim().isEmpty()) {
			throw new IllegalArgumentException("Name cannot be empty");
		}
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		if (roll <= 0) {
			throw new IllegalArgumentException("Roll number must be positive");
		}
		this.roll = roll;
	}	
	
	//@Override
	public String toString() {
		return "Student {name = " + name + ", roll=" + roll+ "}";
	}
	
}
