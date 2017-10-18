package com.sample.demo1.service;

import java.util.List;

import com.sample.demo1.vo.Criteria;
import com.sample.demo1.vo.Employee;

public interface EmployeeService {
	
	List<Employee> searchEmployees(Criteria c);
}
