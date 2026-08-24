package com.kodewala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kodewala.spring.Employee;
import com.kodewala.spring.Product;

public class App 
{
    public static void main( String[] args )
    {
    	
    	String path = "com/kodewala/spring/beans.xml";
    	
       ApplicationContext context = new ClassPathXmlApplicationContext(path);
       
       Product product =  (Product) context.getBean("pd");
       
       product.setId(12);
       product.setName("Laptop");
       product.setPrice(50000);
       	
       System.out.println(product);
       
       
       Employee employee =(Employee) context.getBean("emp");
       
       employee.setEmpId(123);
       employee.setName("Abhishek");
       employee.setDepartment("IT");
       
       System.out.println(employee);
    }
}
