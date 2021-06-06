package com.example.HrmsProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.HrmsProject.business.abstracts.SkillService;
import com.example.HrmsProject.core.utilities.results.DataResult;
import com.example.HrmsProject.core.utilities.results.Result;
import com.example.HrmsProject.dataAccess.abstracts.SkillDao;
import com.example.HrmsProject.entities.concretes.Skill;

@Service
public class SkillManager implements SkillService {

	private SkillDao skillDao;
	
	@Autowired
	public SkillManager(SkillDao skillDao) {
		super();
		this.skillDao = skillDao;
	}

	@Override
	public Result add(Skill skill) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result update(Skill skill) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result delete(Skill skill) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<Skill>> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
