package com.kodewala.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kodewala.beans.Account;

@Configuration   //this tells that this class is source fo bean definition
public class SpringConfig {

	@Bean("acc")
	public Account createAccount() {
		
		Account account = new Account();
		account.setAccountHolderName("abhishek");
		account.setAccountNumber("65454");
		account.setIfsc(32654);
		
		return account;
	}
}
