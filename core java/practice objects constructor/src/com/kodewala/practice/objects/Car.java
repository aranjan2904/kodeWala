package com.kodewala.practice.objects;

    class Car1 {
	public void engineWork() {
		System.out.println("Engine has been started");
	}
}

	 class Engine extends Car1{
		public void engineWork() {
			System.out.println("Engine has been stopped");
		}
	}
	 
 public	class Car {
		public static void main(String args[]) {
			Car1 c1 = new Car1();
			c1.engineWork();
			
	}
 }
	
	 

