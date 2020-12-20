package com.example.springboothelloworld;

public class People {
	private String name;
	
	public People(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "People [name=" + name + "]";
	}
	
}
