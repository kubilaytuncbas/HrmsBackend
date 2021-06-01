package com.example.HrmsProject.business.abstracts;

import com.example.HrmsProject.core.utilities.results.Result;
import com.example.HrmsProject.entities.concretes.Employer;
import com.example.HrmsProject.entities.concretes.Jobseeker;

public interface AuthService {
	
	Result registerWithJobSeeker(Jobseeker jobSeeker);
	Result registerWithEmployer(Employer employer);
	

}
