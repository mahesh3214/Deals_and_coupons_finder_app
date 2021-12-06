package com.dealsandcouponsApp.coupons.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coupons")
public class CouponsController {
	
	@RequestMapping("/")
	public String Test() {
		return "hello world";
	}

}
