package com.kodewala.inheritance;

class Animal {
	private String animalName;
	private int Weight;

	public Animal(String animalName, int weight) {
		setAnimalName(animalName);
		setWeight(weight);
	}

	public String getAnimalName() {
		return animalName;
	}

	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}

	public int getWeight() {
		return Weight;
	}

	public void setWeight(int weight) {
		if (weight < 0) {
			System.out.println("weight can't be negative or 0");
		}
		Weight = weight;
	}

}

class Dog extends Animal {
	String breed;

	public Dog(String animalName, int weight, String breed) {
		super(animalName, weight);
		setWeight(weight);
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public void makeSound() {
		System.out.println("Bark");
	}
}

public class Pet {
	public static void main(String[] args) {
		Dog dog = new Dog("Dog", 4, "German");
		
		System.out.println(dog.getAnimalName());
		System.out.println(dog.getBreed());
		System.out.println(dog.getWeight());
		dog.makeSound();
	}
}
