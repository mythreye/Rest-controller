package com.niit.SkillMapper.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.SkillMapper.Model.Employee;

@Repository("employeedao")
@Transactional
public class EmployeeDaoImpl implements EmployeeDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	public boolean newEmployee(Employee employee) 
	{
		try
		{
			sessionFactory.getCurrentSession().save(employee);
			return true;
		}
		catch(Exception exception)
		{
			return false;
		}
	}

	public Employee showOneEmployee(int employeeid) 
	{
		Employee employee;
		try
		{
			employee=(Employee)sessionFactory.getCurrentSession().createQuery("from Employee where employee_id="+employeeid).uniqueResult();
			return employee;
		}
		catch(Exception exception)
		{
			return null;
		}
	}

	public boolean deleteEmployee(int employeeid) 
	{
		try
		{
			 sessionFactory.getCurrentSession().delete(showOneEmployee(employeeid));
			return true;
		}
		catch(Exception exception)
		{
			return false;
		}
	}

	public boolean updateEmployee(Employee newemployee) {
		
		Employee employee;
		try
		{
			employee=showOneEmployee(newemployee.getEmployee_id());
			employee.setPhno(newemployee.getPhno());
			employee.setEmail_id(newemployee.getEmail_id());
			employee.setAddress(newemployee.getAddress());
			sessionFactory.getCurrentSession().update(employee);
			return true;
		}
		catch(Exception exception)
		{
			return false;
		}

	}

	public List<Employee> showAllEmployee() 
	{
		ArrayList<Employee> employeearray=new ArrayList<Employee>();
		try
		{
			employeearray= (ArrayList<Employee>)sessionFactory.getCurrentSession().createQuery("from Employee").list();
			return employeearray;
		}
		catch(Exception exception)
		{
			return null;
		}
	}

}
