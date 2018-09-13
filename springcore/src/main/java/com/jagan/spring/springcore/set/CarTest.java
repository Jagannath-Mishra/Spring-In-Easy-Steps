package com.jagan.spring.springcore.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/jagan/spring/springcore/set/setconfig.xml");
		
		CarDealers dlr = (CarDealers) context.getBean("car");
		
		System.out.println("Dealer name : "+ dlr.getDealer());
		System.out.println("Car Brand : "+ dlr.getBrand());
		System.out.println("Set class : "+ dlr.getBrand().getClass());
	}
}
