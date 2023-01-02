package com.accenture;

public class Television {
	
	private String name;

	
	
	public Television(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Name [name=" + name + "]";
	}
	
	public String getName() {
		return name;
	}
	

}
