package com.sarthak.spring.springjdbc.employee.dao;

import com.sarthak.spring.springjdbc.employee.dto.Employee;

public interface EmployeeDao {

	int create(Employee employee);// create method access the dto object

	int update(Employee employee);
	
	int delete(int id);
	
	Employee read(int id);
}
