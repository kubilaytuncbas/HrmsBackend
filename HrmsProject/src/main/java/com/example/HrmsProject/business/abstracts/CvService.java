package com.example.HrmsProject.business.abstracts;

import java.util.List;

import com.example.HrmsProject.core.utilities.results.DataResult;
import com.example.HrmsProject.core.utilities.results.Result;
import com.example.HrmsProject.entities.concretes.Cv;

public interface CvService {
	Result add(Cv cv);
	Result update(Cv cv);
	Result delete(int id);
	DataResult<List<Cv>> getAll();
	DataResult<Cv> getById(int id);
}
