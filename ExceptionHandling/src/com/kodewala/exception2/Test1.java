package com.kodewala.exception2;

class Demo {

	int[] arr = {10, 20, 30};

	public void display() {

		try {

			System.out.println(arr[5]);

		} 
		catch (ArrayIndexOutOfBoundsException e) {

			e.printStackTrace();
			System.out.println("Invalid array index");
		} 
		catch (Exception e) {

			e.printStackTrace();
		}
	}
}

public class Test1 {

	public static void main(String[] args) {

		Demo demo = new Demo();

		demo.display();
	}
}