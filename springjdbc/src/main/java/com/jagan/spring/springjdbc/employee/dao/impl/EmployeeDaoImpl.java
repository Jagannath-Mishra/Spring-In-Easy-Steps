package com.jagan.spring.springjdbc.employee.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;

import com.jagan.spring.springjdbc.employee.dao.employeeDao;
import com.jagan.spring.springjdbc.employee.dto.Employee;

public class EmployeeDaoImpl implements employeeDao {


	private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public int create(Employee employee) {
		String sql = "insert into employee values(?,?,?)";
		int result = jdbcTemplate.update(sql, employee.getId(), employee.getFirstName(), employee.getLastName());
		return result;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
