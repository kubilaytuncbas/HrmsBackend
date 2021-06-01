package com.example.HrmsProject.business.concretes;

import java.security.KeyStore.PrivateKeyEntry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.HrmsProject.business.abstracts.AuthService;
import com.example.HrmsProject.business.abstracts.JobSeekerService;
import com.example.HrmsProject.business.abstracts.UserService;
import com.example.HrmsProject.core.utilities.adapters.ValidationService;
import com.example.HrmsProject.entities.concretes.Employee;
import com.example.HrmsProject.entities.concretes.Jobseeker;
import com.sun.net.httpserver.Authenticator.Result;

@Service
public class AuthManager implements AuthService {
	
	private UserService userService;
	private JobSeekerService jobSeekerService;
	private ValidationService validationService;
	
	
	@Autowired
	public AuthManager(UserService userService, JobSeekerService jobSeekerService,
			ValidationService validationService) {
		super();
		this.userService = userService;
		this.jobSeekerService = jobSeekerService;
		this.validationService = validationService;
	}


	
	


	@Override
	public Result registerWithJobSeeker(Jobseeker jobSeeker) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result registerWithEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	private boolean checkIfEqualEmailAndDomain(String email, String website) {
		String[] emailArr = email.split("@", 2);
		String domain = website.substring(4, website.length());

		if (emailArr[1].equals(domain)) {

			return true;
		}

		return false;

	}
	private boolean checkFirstAndLastName(Jobseeker firstName,Jobseeker lastName) {
		if (firstName.getFirstName()==null || lastName.getLastName()==null) {
			return false;
		
		}
		return true;
	}
	private boolean checkPasswordAndVerifyPassword(String password,String matchPassword) {
		
		if (password.equals(matchPassword)) {
			
			return true;
		}
		return false;
	}
	private boolean isCheckFieldsEmpty(Jobseeker jobSeeker) {
		if (jobSeeker.getEmail()==null && jobSeeker.getPassword()==null && jobSeeker.getVerifyPassword()==null) {
			
			return false;
		}
		return true;
		
	}
	private boolean checkIfNationalityId(String nationalityId) {
		if (this.jobSeekerService.findAllByNationalityId(nationalityId).getData()==null){
			return true;
		}
		return false;
	}
	private boolean checkIffRealPerson(String nationalityId,String firstName,String lastName,int yearOfBirth) {
		if (validationService.validateByFakeMernis(nationalityId, firstName, lastName, yearOfBirth)) {
			return true;
		}
		return false;
	}
}
