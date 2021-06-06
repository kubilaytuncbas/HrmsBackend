package com.example.HrmsProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.HrmsProject.business.abstracts.ExperienceService;
import com.example.HrmsProject.core.utilities.results.DataResult;
import com.example.HrmsProject.core.utilities.results.Result;
import com.example.HrmsProject.dataAccess.abstracts.ExperienceDao;
import com.example.HrmsProject.entities.concretes.Experience;

@Service
public class ExperienceManager implements ExperienceService {

	private ExperienceDao experienceDao;
	
	@Autowired
	public ExperienceManager(ExperienceDao experienceDao) {
		super();
		this.experienceDao = experienceDao;
	}

	@Override
	public Result add(Experience experience) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result update(Experience experience) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result delete(Experience experience) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<Experience>> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
