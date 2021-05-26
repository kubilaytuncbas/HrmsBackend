package com.example.HrmsProject.business.abstracts;

import java.util.List;

import com.example.HrmsProject.core.utilities.results.DataResult;
import com.example.HrmsProject.core.utilities.results.Result;
import com.example.HrmsProject.entities.concretes.JobPosition;


public interface JobPositionService {

	Result add(JobPosition jobPosition);
	Result update(JobPosition jobPosition);
	Result delete(JobPosition jobPosition);
	DataResult<List<JobPosition>> getAll();
}
