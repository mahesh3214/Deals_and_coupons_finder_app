package com.dealsand.couponsApp.Login.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {
	
	@RequestMapping("/")
	public String Test() {
		return "hello world!!?";

	}

}
