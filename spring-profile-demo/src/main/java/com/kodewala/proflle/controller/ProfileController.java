package com.kodewala.proflle.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodewala.proflle.service.MessageService;

@RestController
public class ProfileController {
	
	private final MessageService messageService;
	
	public ProfileController(MessageService messageService) {
		this.messageService = messageService;
	}
	
	
	@GetMapping("/profile")
	public String profile() {
		
		return messageService.getMessage();
	}

}
