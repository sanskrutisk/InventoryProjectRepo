package com.cjc.main.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	@RequestMapping("/")
	public String preLog() {
		
		return "Register here";
	}
	
}
