package com.example.HrmsProject.business.abstracts;

import java.util.List;

import com.example.HrmsProject.core.utilities.results.DataResult;
import com.example.HrmsProject.core.utilities.results.Result;
import com.example.HrmsProject.entities.concretes.Experience;


public interface ExperienceService {
	Result add(Experience experience);
	Result update(Experience experience);
	Result delete(Experience experience);
	DataResult<List<Experience>> getAll();
	DataResult<List<Experience>> getAllByCv_idOrderByEndAtDesc(int id);
	DataResult<List<Experience>> getAllByCv_id(int id);
}
