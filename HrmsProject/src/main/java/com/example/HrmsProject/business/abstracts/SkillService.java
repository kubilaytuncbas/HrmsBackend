package com.example.HrmsProject.business.abstracts;

import java.util.List;

import com.example.HrmsProject.core.utilities.results.DataResult;
import com.example.HrmsProject.core.utilities.results.Result;
import com.example.HrmsProject.entities.concretes.Skill;

public interface SkillService {
	Result add(Skill skill);
	Result update(Skill skill);
	Result delete(Skill skill);
	DataResult<List<Skill>> getAll();
}
