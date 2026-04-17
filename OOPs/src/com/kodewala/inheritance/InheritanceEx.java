package com.kodewala.inheritance;

class Hospital {
	private String address;
	private int electricityBill;

	public Hospital(String address, int electricityBill) {
		this.address = address;
		this.electricityBill = electricityBill;
	}

	public void setElectricityBill(int electricityBill) {
		if (electricityBill >= 0) {
			this.electricityBill = electricityBill;
		}
	}

	public String getAddress() {
		return address;
	}

	public int getElectricityBill() {
		return electricityBill;
	}
}

class Department extends Hospital {

	private int waterBill;

	public Department(String address, int electricityBill, int waterBill) {
		super(address, electricityBill);
		this.waterBill = waterBill;
	}

	public void setWaterBill(int waterBill) {
		if (waterBill > 0) {
			this.waterBill = waterBill;
		}else {
			System.out.println("water bill can't be zero");
		}
	}

	public int getWaterBill() {
		return waterBill;
	}

	public int getTotalBill() {
		return getElectricityBill() + waterBill;
	}

}

public class InheritanceEx {
	public static void main(String[] args) {

		Department department = new Department("Jharkhand", 1000, 500);
		department.setWaterBill(800);

		System.out.println("Address: " + department.getAddress());
		System.out.println("Electricity Bill: " + department.getElectricityBill());
		System.out.println("Water Bill: " + department.getWaterBill());
		System.out.println("Total Bill: " + department.getTotalBill());

	}
}
