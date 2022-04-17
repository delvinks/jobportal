package com.jobportal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/data")
public class MainController {
	
	@GetMapping("/hello")
	public String hello() {
		return "hello bro 123";
	}
	
	@GetMapping("/test")
	public String test() {
		return "index";
	}

}



