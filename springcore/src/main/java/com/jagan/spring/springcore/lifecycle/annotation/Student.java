package com.jagan.spring.springcore.lifecycle.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		System.out.println("Setting Setter Method()");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}
	
	@PostConstruct
	public void hi() {
		System.out.println("Initilizing Init()");
	}
	@PreDestroy
	public void bye() {
		System.out.println("Initilizing destory()");
	}

}
