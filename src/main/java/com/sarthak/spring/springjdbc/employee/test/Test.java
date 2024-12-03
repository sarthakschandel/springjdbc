package com.sarthak.spring.springjdbc.employee.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sarthak.spring.springjdbc.employee.dao.EmployeeDao;
import com.sarthak.spring.springjdbc.employee.dto.Employee;

public class Test {

	public static void main(String args[]) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/sarthak/spring/springjdbc/employee/test/config.xml");// config file for injection
		EmployeeDao dao = (EmployeeDao) context.getBean("employeeDao");// reading the bean
		
		/*Employee employee = new Employee();// creating dto object
		employee.setId(2);
		employee.setFirstName("Johnny");
		employee.setLastName("Doe");*/
		
		// int result = dao.create(employee);
		// invoking create method via dao object
		// sending in info using dto obj
		//int result = dao.update(employee);
		//int result = dao.delete(1);
		Employee employee = dao.read(2);
		System.out.println("Employee records are: " + employee);
		//Employee records are: Employee [id=2, firstName=Johnny, lastName=Doe]
		
		//System.out.println("Number of records inserted are: " + result);
		// Number of records inserted are: 1

	}
}
