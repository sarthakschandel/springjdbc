package com.sarthak.spring.springjdbc.employee.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.sarthak.spring.springjdbc.employee.dao.EmployeeDao;
import com.sarthak.spring.springjdbc.employee.dao.rowmapper.EmployeeRowMapper;
import com.sarthak.spring.springjdbc.employee.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	// wire jdbc template into DaoImpl

	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Employee employee) {
		String sql = "insert into employee values(?,?,?)";
		int result = jdbcTemplate.update(sql, employee.getId(), employee.getFirstName(), employee.getLastName());
		return result;
	}

	@Override
	public int update(Employee employee) {
		String sql = "update employee set firstname=?, lastname=? where id=?";
		int result = jdbcTemplate.update(sql, employee.getFirstName(), employee.getLastName(), employee.getId());
		return result;
	}

	@Override
	public int delete(int id) {
		String sql = "delete from employee where id=?";
		int result = jdbcTemplate.update(sql, id);
		return result;
	}

	@Override
	public Employee read(int id) {
		String sql = "select * from employee where id=?";
		EmployeeRowMapper rowmapper = new EmployeeRowMapper();
		Employee employee = jdbcTemplate.queryForObject(sql, rowmapper, id);
		return employee;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
