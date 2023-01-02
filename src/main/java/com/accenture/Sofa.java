package com.accenture;

public class Sofa {
	
	private String name;
	
	public Sofa(String name) {
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
