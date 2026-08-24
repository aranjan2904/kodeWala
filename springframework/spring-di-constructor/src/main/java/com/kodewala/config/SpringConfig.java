package com.kodewala.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kodewala.address.Address;
import com.kodewala.employee.Employee;

@Configuration
public class SpringConfig {

	@Bean
	public Address address() {
		
		Address address = new Address(221, 33, "madhapur", "223541");
		
		return address;
	}
	
	@Bean
	public Employee employee(Address address) {
		
		Employee employee = new Employee(34, "ranjan", address);
		
		return employee;
	}
}
