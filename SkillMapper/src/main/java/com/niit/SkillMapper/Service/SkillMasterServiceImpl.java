package com.niit.SkillMapper.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.SkillMapper.Model.SkillMaster;
import com.niit.SkillMapper.DAO.*;

@Service("skillmasterservice")
public class SkillMasterServiceImpl implements SkillMasterService {
	@Autowired
	private SkillMasterDAO skillmasterdao;

		public boolean updateSkill(SkillMaster skill) {
		// TODO Auto-generated method stub
		return skillmasterdao.updateSkill(skill);
	}

		@Override
	public boolean newSkillMaster(SkillMaster skill) {
		// TODO Auto-generated method stub
			return skillmasterdao.newSkillMaster(skill);
	}

	@Override
	public SkillMaster showSkill(int employeeid) {
		// TODO Auto-generated method stub
		return skillmasterdao.showSkill(employeeid);
	}

	@Override
	public boolean approveSkillMaster() {
		// TODO Auto-generated method stub
		return skillmasterdao.approveSkillMaster();
	}

}
