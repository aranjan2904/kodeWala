package com.kodewala.address;

public class Address {
	
	private int roomNumber;
	private String roadName;
	private String pincode;
	public int getRoomNumber() {
		return roomNumber;
	}
	
	
	
	public Address(int roomNumber, String roadName, String pincode) {
		super();
		this.roomNumber = roomNumber;
		this.roadName = roadName;
		this.pincode = pincode;
	}



	public void display() {
		System.out.println("Address [roomNumber=" + roomNumber + ", roadName=" + roadName + ", pincode=" + pincode + "]");
	}
	

}
