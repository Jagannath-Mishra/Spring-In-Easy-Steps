package com.jagan.spring.springcore.lifecycle.xml;

public class Patient {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		System.out.println("Setting Setter Method()");
	}
	
	public void hi() {
		System.out.println("Initilizing Init()");
	}
	
	public void bye() {
		System.out.println("Initilizing destory()");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}
	
	
}
