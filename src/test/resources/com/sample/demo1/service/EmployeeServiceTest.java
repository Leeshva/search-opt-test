package com.sample.demo1.service;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sample.demo1.vo.Criteria;
import com.sample.demo1.vo.Employee;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:/META-INF/spring/app-context.xml"})
public class EmployeeServiceTest {
	
	@Autowired
	EmployeeService employeeService;
	
	@Test
	public void testSearchEmployees() {
		String opt = "name";
		String keyword = "Steven";
		
		List<Integer> depts =Arrays.asList(50,60,80,90);
		List<String> jobs = Arrays.asList("AD_PRES", "AD_VP", "IT_PROG", "ST_CLERK");
		Long minSalary = new Long(3000);
		Long maxSalary = new Long(30000);
		String beginDate = "2002-07-01";
		String endDate = "2007-08-31";
		
		Criteria c = new Criteria();
		c.setOpt(opt);
		c.setKeyword(keyword);
		c.setMinSalary(minSalary);
		c.setMaxSalary(maxSalary);
		c.setBeginDate(beginDate);
		c.setEndDate(endDate);
		
		List<Employee> result = employeeService.searchEmployees(c);
		Assert.assertEquals(1, result.size());
		System.out.println(result);
		
	}
	
	
}
