package com.kodewala.address;

public class Address {
	
	private int flatNumber;
	private int roadNumber;
	private String area;
	private String pincode;
	
	
	public Address(int flatNumber, int roadNumber, String area, String pincode) {
		super();
		this.flatNumber = flatNumber;
		this.roadNumber = roadNumber;
		this.area = area;
		this.pincode = pincode;
	}


	public void display() {
		System.out.println("Address [flatNumber=" + flatNumber + ", roadNumber=" + roadNumber + ", area=" + area + ", pincode="
				+ pincode + "]");
	}
	
	

}
