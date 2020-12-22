package com.example.springboothelloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootHelloWorldApplication {

	public static void main(String[] args) {
//		ConfigurableApplicationContext ctx = SpringApplication.run(SpringBootHelloWorldApplication.class, args);
//		SpringBootHelloWorldApplication demo = ctx.getBean(SpringBootHelloWorldApplication.class);
//		demo.hello();
//
//		People p = ctx.getBean(People.class);
//		System.out.println(p);
		SpringApplication.run(SpringBootHelloWorldApplication.class, args);


	}

	public void hello() {
		System.out.println("Hello Spring Boot!!");
	}

}
