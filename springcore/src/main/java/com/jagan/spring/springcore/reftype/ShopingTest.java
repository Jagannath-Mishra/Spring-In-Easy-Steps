package com.jagan.spring.springcore.reftype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class ShopingTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/jagan/spring/springcore/reftype/refconfig.xml");
		
		ShopingCart std = (ShopingCart) context.getBean("shoping");
		
		System.out.println(std.getItem());
		System.out.println(std);
		}
}
