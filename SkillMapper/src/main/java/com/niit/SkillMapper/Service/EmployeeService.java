package com.niit.SkillMapper.Service;
import java.util.List;

import com.niit.SkillMapper.Model.Employee;

public interface EmployeeService
{
	public boolean newEmployee(Employee employee);
	public Employee showOneEmployee(int employeeid);
	public boolean deleteEmployee(int employeeid);
	public boolean updateEmployee(Employee newemployee);
	public List<Employee> showAllEmployee();
}
