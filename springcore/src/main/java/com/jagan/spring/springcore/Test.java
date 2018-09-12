package com.jagan.spring.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {

	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
	Employee e = (Employee) ctx.getBean("emp");
	System.out.println(e.getId() +"--" + e.getName());
	}
}
