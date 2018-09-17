package com.jagan.spring.springjdbc.employee.dao;

import java.util.List;

import com.jagan.spring.springjdbc.employee.dto.Employee;

public interface employeeDao {

		int create(Employee employee);
		
		int update(Employee employee);
		
		int delete(int id);
		
		Employee read(int id);
		
		List<Employee> findAlls();
}
