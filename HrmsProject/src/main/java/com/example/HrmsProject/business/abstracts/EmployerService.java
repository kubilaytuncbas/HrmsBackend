package com.example.HrmsProject.business.abstracts;

import java.util.List;

import com.example.HrmsProject.core.utilities.results.DataResult;
import com.example.HrmsProject.core.utilities.results.Result;
import com.example.HrmsProject.entities.concretes.Employer;



public interface EmployerService {
	
	Result add(Employer employer);
	Result update(Employer employer);
	Result delete(Employer employer);
	DataResult<List<Employer>> getAll();
	Result employerConfirm(int id, boolean isVerified);
}
