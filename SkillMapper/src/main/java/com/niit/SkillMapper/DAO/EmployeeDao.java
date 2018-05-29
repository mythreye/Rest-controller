package com.niit.SkillMapper.DAO;

import java.util.List;

import com.niit.SkillMapper.Model.Employee;

public interface EmployeeDao 
{
	public boolean newEmployee(Employee employee);
	public Employee showOneEmployee(int employeeid);
	public boolean deleteEmployee(int employeeid);
	public boolean updateEmployee(Employee employee);
	public List<Employee> showAllEmployee();
}
