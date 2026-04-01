package com.kodewala.objects;
import java.time.LocalDate;

class Delivery{
	private String customerName;
	private String itemName;
	private LocalDate deliveryDate;
	private int itemPrice;
	private boolean status;
	
	public Delivery(String _cusName, String _itemName,int _itemPrice, LocalDate _delDate, boolean _status) {
		this.customerName = _cusName;
		this.itemName = _itemName;
		this.itemPrice = _itemPrice;
		this.deliveryDate = _delDate;
		this.status = _status;
	}
	
	public void display() {
		System.out.println("Order details of " + customerName);
		System.out.println("Item: "+ itemName);
		System.out.println("Price: "+ itemPrice);
		System.out.println("Delivery Date: "+ deliveryDate);
		System.out.println("Status: "+ (status ? "Delivered" : "Pending"));
		System.out.println("-------------------------------------");
	}
}

public class FoodDelivery {
	public static void main(String[] args) {
		Delivery delivery1 = new Delivery("abhishek", "biryani",1800,LocalDate.of(2026, 4, 1),true);
		Delivery delivery2 = new Delivery("sumit", "paneer naan",1400, LocalDate.of(2026, 4, 1), true);
		Delivery delivery3 = new Delivery("rahul", "desi chicken rice",400, LocalDate.of(2026, 4, 1), true);
		
		delivery1.display();
		delivery2.display();
		delivery3.display();
	}
}
