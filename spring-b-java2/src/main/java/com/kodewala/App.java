package com.kodewala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kodewala.bean.Account;
import com.kodewala.bean.Customer;
import com.kodewala.bean.Employee;
import com.kodewala.config.SpringConfig;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
       
      Employee employee =  context.getBean(Employee.class);
      
      employee.display();
      
      Account account = context.getBean(Account.class);
      System.out.println(account);
      
      Customer customer = context.getBean(Customer.class);
      System.out.println(customer);
    }
}
