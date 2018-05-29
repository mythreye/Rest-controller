package com.niit.SkillMapper.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.SkillMapper.DAO.SkillDAO;
import com.niit.SkillMapper.Model.Skill;



@Service("skillservice")
public class SkillServiceImpl implements SkillService
{
	@Autowired
	private SkillDAO skilldao;

	public boolean newSkill(Skill skill)
	{
	
		return skilldao.newSkill(skill);
	}

	public List<Skill> showAllSkills(int id) 
	{
		return skilldao.showAllSkills(id);
	}
}
