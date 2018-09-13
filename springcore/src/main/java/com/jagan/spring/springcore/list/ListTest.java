package com.jagan.spring.springcore.list;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ListTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/jagan/spring/springcore/list/listconfig.xml");
		Hospital hos = (Hospital) ctx.getBean("hospital");
		
		System.out.println(hos.getName());
		System.out.println(hos.getDepartments());
		System.out.println(hos.getDepartments().getClass());
	}
}
