package com.jagan.spring.springcore.dependancy.check;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependancyTest {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/jagan/spring/springcore/dependancy/check/checkconfig2.xml");
		
		Pescription ps =  (Pescription) context.getBean("pescription");
		
		System.out.println(ps); // Showing Default value : Pescription [id=0, name=null, medicines=null]
		
	}
}
