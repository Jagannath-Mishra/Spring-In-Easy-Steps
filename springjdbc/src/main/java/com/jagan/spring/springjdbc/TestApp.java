package com.jagan.spring.springjdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jagan.spring.springjdbc.employee.dao.impl.EmployeeDaoImpl;
import com.jagan.spring.springjdbc.employee.dto.Employee;

public class TestApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		EmployeeDaoImpl employeeDAO = (EmployeeDaoImpl) context.getBean("employeeDao");
		Employee emp = new Employee();
		emp.setId(3);
		emp.setFirstName("Rajesh");
		emp.setLastName("Handu");
				
	/*	int result =  employeeDAO.create(emp);
		System.out.println("Number of records inserted are: " + result);*/
		
		
		/*int result = employeeDAO.update(emp);
		
		System.out.println("Number of records updated are: " + result);*/
		
		/*int result = employeeDAO.delete(1);
		
		System.out.println("Number of records deleted are: " + result);*/
		
		/*Employee result = employeeDAO.read(2);
		
		System.out.println("Number of records found are: " + result);*/
		
		
		List<Employee> result = employeeDAO.findAlls();

		System.out.println("Number of records found are: " + result);
	}
}
