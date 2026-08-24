package com.kodewala.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	
	
	@GetMapping("/viewsForm")
	public String viewLoginPage() {
		
		System.out.println("LoginController.viewLoginPage()");
		return "login-form";
	}

}
