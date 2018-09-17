package com.jagan.spring.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jagan.spring.springjdbc.employee.dao.impl.EmployeeDaoImpl;
import com.jagan.spring.springjdbc.employee.dto.Employee;

public class TestApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		EmployeeDaoImpl employeeDAO = (EmployeeDaoImpl) context.getBean("employeeDaoImpl");
		Employee emp = new Employee();
		emp.setId(1);
		emp.setFirstName("Gariyashee");
		emp.setLastName("Dutta");
				
		/*int result =  employeeDAO.create(emp);
		System.out.println("Number of records inserted are: " + result);*/
		
		/*int result = employeeDAO.update(emp);
		
		System.out.println("Number of records updated are: " + result);*/
		
		int result = employeeDAO.delete(1);
		
		System.out.println("Number of records deleted are: " + result);
	}
}
