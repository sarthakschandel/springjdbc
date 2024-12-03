package com.sarthak.spring.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {

	public static void main(String args[]) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/sarthak/spring/springjdbc/config.xml");
		JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");
		String sql = "insert into employee values(?,?,?)";//? are the placeholder for values
		int result = jdbcTemplate.update(sql, new Integer(1), "Sarthak", "Singh Chandel");//values
		System.out.println("Number of records inserted are: " + result);
		//Number of records inserted are: 1

	}
}
