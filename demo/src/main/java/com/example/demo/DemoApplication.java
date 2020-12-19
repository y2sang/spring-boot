package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
		DemoApplication demo = ctx.getBean(DemoApplication.class);
		demo.hello();
		
	}

	public void hello() {
		System.out.println("Hello Spring Boot!!!");
	}

}
