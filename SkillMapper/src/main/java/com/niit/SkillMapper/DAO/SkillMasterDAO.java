package com.niit.SkillMapper.DAO;
import com.niit.SkillMapper.Model.SkillMaster;

public interface SkillMasterDAO
{
	public boolean newSkillMaster(SkillMaster skill);
	public boolean updateSkill(SkillMaster skill);
	public SkillMaster showSkill(int employeeid);
	public boolean approveSkillMaster();
}
