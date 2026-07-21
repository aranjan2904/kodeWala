package com.kodewala;

public class ContinueLoopsPractice {
	public static void main(String[] args) {
		String[] products = {"Laptop","Mobile","apple Headphones",null,"Keyboard","Mouse","apple Monitor","Tablet",null,"Printer","Camera","Speaker","Smartwatch","Router",null,
								"Charger","USB Cable","Power Bank","Hard Drive","SSD",null,"Graphics Card","RAM","Processor","Motherboard","Cooling Fan",
								null,"Projector","Microphone","Webcam"};
		for (int i=0; i< products.length; i++)
		{
			String currentProduct = products[i];
			if(currentProduct == null || currentProduct.startsWith("apple"))
			{
				continue;
			}
			if (currentProduct.equalsIgnoreCase("Mouse"))
			{
				System.out.println("Product found: "+ currentProduct);
				continue;
			}
			
			System.out.println(currentProduct.toUpperCase());
		}
	}
}
