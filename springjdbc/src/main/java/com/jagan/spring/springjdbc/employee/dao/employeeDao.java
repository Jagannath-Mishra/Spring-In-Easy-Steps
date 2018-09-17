package com.jagan.spring.springjdbc.employee.dao;

import com.jagan.spring.springjdbc.employee.dto.Employee;

public interface employeeDao {

		int create(Employee employee);
		
		int update(Employee employee);
}
