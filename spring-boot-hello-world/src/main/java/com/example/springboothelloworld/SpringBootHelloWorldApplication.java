package com.example.springboothelloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootHelloWorldApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringBootHelloWorldApplication.class, args);
		SpringBootHelloWorldApplication demo = ctx.getBean(SpringBootHelloWorldApplication.class);
		demo.hello();
		
	}

	public void hello() {
		System.out.println("Hello Spring Boot!!");
	}


}
