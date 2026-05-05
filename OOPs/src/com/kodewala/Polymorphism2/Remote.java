package com.kodewala.Polymorphism2;

public class Remote {
	public void turnOn() {
		
		checkTvOnOrOff();
		stablishingConnectionToTv();
		sendingSignalToTurnOn();
		
	}
	
	private void checkTvOnOrOff() {
		System.out.println("checking TV is already on or off");
	}
	
	private void stablishingConnectionToTv() {
		System.out.println("stablishing connection to tv");
	}
	
	private void sendingSignalToTurnOn() {
		System.out.println("turing on tv");
	}
}

