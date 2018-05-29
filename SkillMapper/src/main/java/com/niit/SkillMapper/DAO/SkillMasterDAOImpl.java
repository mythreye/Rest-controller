package com.niit.SkillMapper.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.SkillMapper.DAO.SkillMasterDAO;

import com.niit.SkillMapper.Model.SkillMaster;

@Repository("skillmasterdao")
@Transactional
public class SkillMasterDAOImpl implements SkillMasterDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public boolean newSkillMaster(SkillMaster skill) {
		try {
			sessionFactory.getCurrentSession().save(skill);
			return true;
		} catch (Exception exception) {
			return false;
		}
	}


	public boolean approveSkillMaster() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updateSkill(SkillMaster skill) 
	{
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(skill);
			return true;
		} catch (Exception exception) {
			return false;
		}}

	@Override
	public SkillMaster showSkill(int employeeid) 
	{
		System.out.println(employeeid);
		try 
		{
			System.out.println(employeeid);
			SkillMaster skilldetails = (SkillMaster) sessionFactory.getCurrentSession()
					.createQuery("from SkillMaster where employeeid = " + employeeid).uniqueResult();
			return skilldetails;
		} catch (Exception exception) 
		{
			System.out.println("i caught you"+exception.getMessage());

			return null;
		}
	}

}
