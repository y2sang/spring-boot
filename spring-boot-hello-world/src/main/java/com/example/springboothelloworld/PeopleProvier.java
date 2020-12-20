package com.example.springboothelloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PeopleProvier {
	@Bean
	public People getNmae() {
		// return new People("y2sang provider");
		return new People();
	}
}
