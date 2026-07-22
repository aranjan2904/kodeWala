package com.kodewala.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kodewala.bean.Account;
import com.kodewala.bean.Customer;
import com.kodewala.bean.Employee;

@Configuration
public class SpringConfig {
	
	@Bean
	public Employee employee() {
		
		Employee emp = new Employee();
		
		emp.setId(1);
		emp.setName("Ranjan");
		emp.setSalary(45000);
		
		return emp;
	}
	
	@Bean
	public Account account() {
		
		Account acc = new Account();
		
		acc.setAccountNo(3452235);
		acc.setBalance(60000);
		
		return acc;
		
	}
	
	 @Bean
	    public Customer customer() {

	        Customer c = new Customer();

	        c.setName("Ranjan");

	        c.setAccount(account());

	        return c;
	    }

}
