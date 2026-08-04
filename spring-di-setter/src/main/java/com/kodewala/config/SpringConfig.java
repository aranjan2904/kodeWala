package com.kodewala.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kodewala.address.Address;
import com.kodewala.employee.Employee;

@Configuration
public class SpringConfig {
	
	@Bean("add")
	public Address address() {
		
		Address address = new Address(21, "Genz road", "222554");
		
		return address;
	}
	
	
	@Bean("emp")
	public Employee employee(Address address) {
		
		Employee employee = new Employee(21, "ranjan");
		
		employee.setAddress(address);
		
		return employee;
	}

}
