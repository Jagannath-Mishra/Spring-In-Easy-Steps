package com.jagan.spring.springcore.properties;

import org.junit.experimental.theories.PotentialAssignment.CouldNotGenerateValueException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class PropertiesTest {
public static void main(String[] args) {

	BeanFactory bf = new XmlBeanFactory(new ClassPathResource("com/jagan/spring/springcore/properties/propertiesconfig.xml"));
	
	CountriesAndLanguages cl = (CountriesAndLanguages) bf.getBean("country");
	
	System.out.println(cl.getCountryAndLangs());
	System.out.println(cl.getCountryAndLangs().getClass());
}
}
