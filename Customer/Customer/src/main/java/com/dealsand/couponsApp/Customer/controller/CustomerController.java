package com.dealsand.couponsApp.Customer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	@RequestMapping("/")
	public String Test() {
		return "hello world!!!";

	}
}
