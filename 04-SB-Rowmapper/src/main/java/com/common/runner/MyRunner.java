package com.common.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.common.dao.EmployeeDao;

@Component
public class MyRunner implements CommandLineRunner {

	
	

	@Value("${deptNo}")
	private Integer deptNo;
	@Autowired
	EmployeeDao dao;
	@Override
	public void run(String... args) throws Exception {
		dao.findEmployeeByDeptno(deptNo).forEach(System.out::println);
	}

}
