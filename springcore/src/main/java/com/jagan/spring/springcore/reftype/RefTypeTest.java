package com.jagan.spring.springcore.reftype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RefTypeTest {
public static void main(String[] args) {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("com/jagan/spring/springcore/reftype/refconfig.xml");
	
	Students std = (Students) context.getBean("students");
	
	System.out.println(std.getScoresHasA());
	System.out.println(std);
}
}
