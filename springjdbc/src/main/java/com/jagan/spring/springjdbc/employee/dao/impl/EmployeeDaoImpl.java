package com.jagan.spring.springjdbc.employee.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.jagan.spring.springjdbc.employee.dao.employeeDao;
import com.jagan.spring.springjdbc.employee.dto.Employee;
import com.jagan.spring.springjdbc.employee.rowmapper.EmployeeRowMapper;

public class EmployeeDaoImpl implements employeeDao {


	private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public int create(Employee employee) {
		String sql = "insert into employee values(?,?,?)";
		int result = jdbcTemplate.update(sql, employee.getId(), employee.getFirstName(), employee.getLastName());
		return result;
	}
	

	@Override
	public int update(Employee employee) {
		String sql ="update employee set firstname=?, lastname=? where id=?";
		int result = jdbcTemplate.update(sql, employee.getFirstName(), employee.getLastName(), employee.getId());
		return result;
	}

	@Override
	public int delete(int id) {
		String Sql = "delete from employee where id = ?";
		int result = jdbcTemplate.update(Sql, id);
		return result;
	}

	@Override
	public Employee read(int id) {
		String Sql =  "select * from employee where id=?";
		EmployeeRowMapper rowMapper = new EmployeeRowMapper();
		Employee result = jdbcTemplate.queryForObject(Sql, rowMapper, id);
		return result;
	}
	
	@Override
	public List<Employee> findAlls() {
		String sql = "Select * from employee";
		EmployeeRowMapper rowMapper = new EmployeeRowMapper();
		List<Employee> result = jdbcTemplate.query(sql, rowMapper);
		return result;
	}

	

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	

	

	

}
