package com.kodewala.proflle.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("prod")
public class ProdMessageService implements MessageService{
	
	@Override
	public String getMessage() {
		
		return "This is PROD environment";
	}

}
