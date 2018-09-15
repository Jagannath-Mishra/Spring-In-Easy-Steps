package com.jagan.spring.springcore.lifecycle.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean,DisposableBean {
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

	@Override
	public void destroy() throws Exception {
		System.out.println("Bean Destoried");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Bean Initilalized");
		
	}
}
