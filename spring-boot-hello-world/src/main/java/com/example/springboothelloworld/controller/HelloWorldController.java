package com.example.springboothelloworld.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboothelloworld.People;

@RestController
@RequestMapping("/say")
public class HelloWorldController {
	@RequestMapping(method = RequestMethod.POST)
	// @PostMapping("/say")
	public People hello(@RequestBody People vo) {
		System.out.println(vo);
		People p = new People();
		p.setName(vo.getName());
		p.setAge(vo.getAge());
		return p;
	}
}
