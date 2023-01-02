package com.accenture;

public class Refrigerator {
	
	private String name;
	
	public Refrigerator(String name) {
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
