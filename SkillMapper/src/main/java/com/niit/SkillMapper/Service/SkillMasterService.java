package com.niit.SkillMapper.Service;
import java.util.List;

import com.niit.SkillMapper.Model.Employee;
import com.niit.SkillMapper.Model.Skill;
import com.niit.SkillMapper.Model.SkillMaster;

public interface SkillMasterService
{
	public boolean newSkillMaster(SkillMaster skill);
	public boolean updateSkill(SkillMaster skill);
	public SkillMaster showSkill(int employeeid);
	public boolean approveSkillMaster();
}
