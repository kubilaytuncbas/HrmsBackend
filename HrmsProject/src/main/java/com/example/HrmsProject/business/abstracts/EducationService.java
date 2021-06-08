package com.example.HrmsProject.business.abstracts;

import java.util.List;

import com.example.HrmsProject.core.utilities.results.DataResult;
import com.example.HrmsProject.core.utilities.results.Result;
import com.example.HrmsProject.entities.concretes.Education;

public interface EducationService {
	Result add(Education education);
	Result update(Education education);
	Result delete(int id);
	DataResult<List<Education>> getAll();
	DataResult<List<Education>> getAllByCv_idOrderByEndTimeDesc(int id);
	DataResult<List<Education>> getAllByCv_id(int id);

}
