package com.example.HrmsProject.business.abstracts;

import com.example.HrmsProject.entities.concretes.Employee;
import com.example.HrmsProject.entities.concretes.Jobseeker;
import com.sun.net.httpserver.Authenticator.Result;

public interface AuthService {
	
	Result registerWithJobSeeker(Jobseeker jobSeeker);
	Result registerWithEmployee(Employee employee);
	

}
