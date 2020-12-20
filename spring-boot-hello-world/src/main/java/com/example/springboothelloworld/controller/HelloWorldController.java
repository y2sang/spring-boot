package com.example.springboothelloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/say")
public class HelloWorldController {
	@RequestMapping(method=RequestMethod.GET)
	public String hello() {
		return "Hello Spring Boot MVC";
	}
}
