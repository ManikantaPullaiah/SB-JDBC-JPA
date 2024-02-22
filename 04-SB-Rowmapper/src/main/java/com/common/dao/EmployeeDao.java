package com.common.dao;

import java.util.List;

import com.common.model.Employee;

public interface EmployeeDao {
	List<Employee> findEmployeeByDeptno(Integer deptNo);

}
