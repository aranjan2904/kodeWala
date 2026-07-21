package com.kodewala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kodewala.product.Product;

public class App 
{
    public static void main(String[] args) {
    	
		String configFile = "com/kodewala/beans.xml";
		
		ApplicationContext context = new ClassPathXmlApplicationContext(configFile);
		
		Product product =  (Product) context.getBean("pd");
		
		product.setId(654);
		product.setName("Laptop");
		product.setDescription("Asus VivoBook");

		product.showProduct();
	}
}
