package com.accenture;

public class Home {
	
	private Television television;
	private Sofa sofa;
	private Refrigerator refrigerator;
	
	
	
	

	public void setTelevision(Television television) {
		this.television = television;
	}
	public void setSofa(Sofa sofa ) {
		this.sofa = sofa;
	}
	public void setRefrigerator(Refrigerator refrigerator) {
		this.refrigerator = refrigerator;
	}


	

	public void homeInfo() {

		System.out.println("Television name:"+television.getName());
		System.out.println("Sofa name:"+sofa.getName());
		System.out.println("Refrigerator name:"+refrigerator.getName());
	}

}
