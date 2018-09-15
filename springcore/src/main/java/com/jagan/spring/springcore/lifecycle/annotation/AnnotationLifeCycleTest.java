package com.jagan.spring.springcore.lifecycle.annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationLifeCycleTest {

	public static void main(String[] args) throws Exception {
		
	AbstractApplicationContext bf = new ClassPathXmlApplicationContext("com/jagan/spring/springcore/lifecycle/annotation/AnnotationLifeCycleconfig.xml");
		
		Student std =  (Student) bf.getBean("student");
		
		System.out.println(std.getId());
		
		bf.registerShutdownHook();
	}
	
}
