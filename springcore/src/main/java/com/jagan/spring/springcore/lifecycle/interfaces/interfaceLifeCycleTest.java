package com.jagan.spring.springcore.lifecycle.interfaces;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class interfaceLifeCycleTest {

	public static void main(String[] args) throws Exception {
		
	BeanFactory bf = new XmlBeanFactory(new ClassPathResource("com/jagan/spring/springcore/lifecycle/interfaces/InterfaceLifeCycleconfig.xml"));
		
		Student std =  (Student) bf.getBean("student");
		
		System.out.println(std.getId());
		
		std.destroy();
	}
	
}
