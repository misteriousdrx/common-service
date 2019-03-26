package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {

	@RequestMapping("/")
	public String getValue() {
		System.out.println("");
		System.out.println("Service Called.");
		System.out.println("");
		return "33";
	}
	
}
