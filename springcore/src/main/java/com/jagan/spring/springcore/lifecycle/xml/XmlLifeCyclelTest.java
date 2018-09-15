package com.jagan.spring.springcore.lifecycle.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlLifeCyclelTest {

	
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/jagan/spring/springcore/lifecycle/xml/XmlLifeCycleconfig.xml");
		
		Patient pt = (Patient) context.getBean("patient");
		
		System.out.println(pt.getId());
		
		//Running destroy method
		context.registerShutdownHook();
		
	}
}
