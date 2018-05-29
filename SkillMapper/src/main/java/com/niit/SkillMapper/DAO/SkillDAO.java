package com.niit.SkillMapper.DAO;
import java.util.List;

import com.niit.SkillMapper.Model.Employee;
import com.niit.SkillMapper.Model.Skill;

public interface SkillDAO
{
	public boolean newSkill(Skill skill);
	public List<Skill> showAllSkills(int employee_id);
}
