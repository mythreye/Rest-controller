package com.niit.SkillMapper.Service;
import java.util.List;

import com.niit.SkillMapper.Model.Employee;
import com.niit.SkillMapper.Model.Skill;

public interface SkillService
{
	public boolean newSkill(Skill skill);
	public List<Skill> showAllSkills(int id);
}
