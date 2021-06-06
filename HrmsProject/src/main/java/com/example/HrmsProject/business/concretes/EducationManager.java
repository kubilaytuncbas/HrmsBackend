package com.example.HrmsProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.HrmsProject.business.abstracts.EducationService;
import com.example.HrmsProject.core.utilities.results.DataResult;
import com.example.HrmsProject.core.utilities.results.Result;
import com.example.HrmsProject.dataAccess.abstracts.EducationDao;
import com.example.HrmsProject.entities.concretes.Education;
@Service
public class EducationManager implements EducationService {

	private EducationDao educationDao;
	
	@Autowired
	public EducationManager(EducationDao educationDao) {
		super();
		this.educationDao = educationDao;
	}

	@Override
	public Result add(Education education) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result update(Education education) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result delete(Education education) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<Education>> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
