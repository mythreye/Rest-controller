package com.niit.SkillMapper;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.niit.SkillMapper.MapperConfigaration.MapperConfig;
import com.niit.SkillMapper.Model.Employee;
import com.niit.SkillMapper.Service.EmployeeService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringJUnitConfig(MapperConfig.class)
public class insert 
{
	@Autowired
	EmployeeService empserve;
	Employee employee=new  Employee();

	@Before
	public void setUp() throws Exception
	{
		empserve.newEmployee(employee);
		
	}

	@After
	public void tearDown() throws Exception 
	{
		empserve.newEmployee(employee);

	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
