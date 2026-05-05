package com.kodewala.abstract1;

abstract class Society{
	public abstract void payMaintenance();
	
	public void payRentAdvance() {
		System.out.println("pay rent in advance");
	}
}

class FlatOne extends Society{
	@Override
	public void payMaintenance() {
		System.out.println("paying maintenance for Flat 101");
	}
}

class FlatTwo extends Society{
	@Override
	public void payMaintenance() {
		System.out.println("paying maintenance for flat 102");
	}
}

class FlatThree extends Society {
	@Override
	public void payMaintenance() {
		System.out.println("paying maintenance for flat 103");
	}
	public void payRentAdcance() {
		System.out.println("paying rent in advance");
	}
}

public class SocietySystem {
	public static void main(String[] args) {
		
		FlatOne flat101 = new FlatOne();
		
		Society society = new FlatOne();
		
	}
}
