package com.sample.demo1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.demo1.mappers.EmployeeMapper;
import com.sample.demo1.vo.Criteria;
import com.sample.demo1.vo.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeMapper employeeMapper;
	
	public List<Employee> searchEmployees(Criteria c) {
		if (c == null) {
			throw new IllegalArgumentException("¿À·ù³²");
		}
		return employeeMapper.searchEmployees(c);
		
	}
}
