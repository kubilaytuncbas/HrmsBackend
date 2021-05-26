package com.example.HrmsProject.business.abstracts;

import java.util.List;

import com.example.HrmsProject.core.utilities.results.DataResult;
import com.example.HrmsProject.core.utilities.results.Result;
import com.example.HrmsProject.entities.concretes.Jobseeker;


public interface JobSeekerService {
	
	Result add(Jobseeker jobSeeker);
	Result update(Jobseeker jobSeeker);
	Result delete(Jobseeker jobSeeker);
	DataResult<List<Jobseeker>> getAll();

}