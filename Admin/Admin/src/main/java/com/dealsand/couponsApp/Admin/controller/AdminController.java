package com.dealsand.couponsApp.Admin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@RequestMapping("/")
	public String Test() {
		return "hello world";

}
}