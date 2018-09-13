package com.jagan.spring.springcore.map;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class StudentTest {
public static void main(String[] args) {
	BeanFactory bf = new XmlBeanFactory(new ClassPathResource("com/jagan/spring/springcore/map/mapconfig.xml"));
	
	Student std = (Student) bf.getBean("student");
	System.out.println(std.getName());
	System.out.println(std.getAge());
	System.out.println(std.getMarks());
	System.out.println(std.getMarks().getClass());
}
}
