package com.example.HrmsProject.business.abstracts;

import java.util.List;

import com.example.HrmsProject.core.utilities.results.DataResult;
import com.example.HrmsProject.core.utilities.results.Result;
import com.example.HrmsProject.entities.concretes.Jobseeker;


public interface JobSeekerService {
	
	Result add(Jobseeker jobSeeker);
	Result update(Jobseeker jobSeeker);
	Result delete(int id);
	DataResult<List<Jobseeker>> getAll();
	DataResult<List<Jobseeker>> findAllByNationalityId(String nationalityId);
	DataResult<Jobseeker> getById(int id);
	

}
