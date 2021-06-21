package com.example.HrmsProject.business.abstracts;

import java.util.List;

import com.example.HrmsProject.core.utilities.results.DataResult;
import com.example.HrmsProject.core.utilities.results.Result;
import com.example.HrmsProject.entities.concretes.WorkingTime;

public interface WorkingTimeService {
	
	DataResult<List<WorkingTime>> getAll();
	
	Result add(WorkingTime workingTime);

}
