package com.niit.SkillMapper.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.SkillMapper.DAO.EmployeeDao;
import com.niit.SkillMapper.Model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService
{
	@Autowired
	private EmployeeDao employeedao;

	public boolean newEmployee(Employee employee) 
	{
		return employeedao.newEmployee(employee);
	}

	public Employee showOneEmployee(int employeeid)
	{
		return employeedao.showOneEmployee(employeeid);
	}

	public boolean deleteEmployee(int employeeid) 
	{
		return employeedao.deleteEmployee(employeeid);
	}

	public boolean updateEmployee(Employee newemployee) 
	{
		// TODO Auto-generated method stub
		return employeedao.updateEmployee(newemployee);
	}

	public List<Employee> showAllEmployee() 
	{
		// TODO Auto-generated method stub
		return employeedao.showAllEmployee();
	}

	

}
