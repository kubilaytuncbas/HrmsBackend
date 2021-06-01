package com.example.HrmsProject.business.concretes;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.HrmsProject.business.abstracts.AuthService;
import com.example.HrmsProject.business.abstracts.EmployerService;
import com.example.HrmsProject.business.abstracts.JobSeekerService;
import com.example.HrmsProject.business.abstracts.UserService;
import com.example.HrmsProject.core.EmailRegex;
import com.example.HrmsProject.core.utilities.adapters.ValidationService;
import com.example.HrmsProject.core.utilities.results.ErrorResult;
import com.example.HrmsProject.core.utilities.results.Result;
import com.example.HrmsProject.core.utilities.results.SuccessResult;
import com.example.HrmsProject.entities.concretes.Employer;
import com.example.HrmsProject.entities.concretes.Jobseeker;
import com.example.HrmsProject.entities.concretes.User;

@Service
public class AuthManager implements AuthService {
	
	private UserService userService;
	private JobSeekerService jobSeekerService;
	private ValidationService validationService;
	private EmployerService employerService;
	
	@Autowired
	public AuthManager(UserService userService, JobSeekerService jobSeekerService, ValidationService validationService,
			EmployerService employerService) {
		super();
		this.userService = userService;
		this.jobSeekerService = jobSeekerService;
		this.validationService = validationService;
		this.employerService = employerService;
	}


	@Override
	public Result registerWithJobSeeker(Jobseeker jobSeeker) {
		// TODO Auto-generated method stub
		if (checkIffRealPerson(jobSeeker.getNationalityId(), jobSeeker.getFirstName(), jobSeeker.getLastName(), jobSeeker.getDateOfBirth().getYear())==false) {
			return new ErrorResult("Böyle bir kişi bulunmamakta");
		}
		else if (isCheckFieldsEmpty(jobSeeker)==false) {
			return new ErrorResult("Bilgiler Boş bırakılamaz");
		}
		else if (checkFirstAndLastName(jobSeeker, jobSeeker)==false) {
			return new ErrorResult("İsim veya Soyisim Boş bırakılamaz!");
		}
		else if (checkPasswordAndVerifyPassword(jobSeeker)==false) {
			return new ErrorResult("Şifreler birbirleriyle uyuşmuyor!!");
		}
		else if(checkIfNationalityId(jobSeeker.getNationalityId())==true) {
			return new ErrorResult("Aynı TC kimlik no ile birden fazla kayıt oluşturulamaz!!");
		}
		else if (EmailRegex.isEmailValid(jobSeeker.getEmail())==false) {
			return new ErrorResult("Mail yapınız yanlış lütfen kontrol ediniz!!");
		}
		else if (checkIfEmail(jobSeeker.getEmail())==false) {
			return new ErrorResult("Aynı mail adresiyle birden fazla kayıt oluşturulamaz!!");
		}
		else {
			jobSeekerService.add(jobSeeker);
			return new SuccessResult("Kişi başarıyla oluşturuldu.");
		}
		
	}

	@Override
	public Result registerWithEmployer(Employer employer) {
		if (CheckFieldsEmpty(employer)==false) {
			return new ErrorResult("Boş alan bırakılamaz");
		}
		else if (checkIfEqualEmailAndDomain(employer.getEmail(), employer.getWebsite())==false) {
			return new ErrorResult("Email ve Website domainleriniz uyuşmuyor lütfen kontrol ediniz!!");
		}
		else if (checkIfEmail(employer.getEmail())==false) {
			return new ErrorResult("Aynı mail adresiyle birden fazla kayıt oluşturulamaz!!");
		}
		else if (checkPasswordAndVerifyPassword(employer)==false) {
			return new ErrorResult("Şifreleriniz birbirleriyle uyumuşmamakta, lütfen kontrol ediniz!!");
		}
		else {
			userService.add(employer);
			return new SuccessResult("Kayıt Başarıyla Oluşturuldu.");
		}
		
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
		if (firstName.getFirstName()==null && lastName.getLastName()==null) {
			return false;
		
		}
		return true;
	}
	
	private boolean checkPasswordAndVerifyPassword(User user) {
		
		if (user.getPassword().equals(user.getVerifyPassword())) {
			
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
	private boolean checkIfEmail(String email) {
		if (this.userService.findAllUserByEmail(email).getData()==null) {
			return true;
		}
		return false;
	}
	private boolean CheckFieldsEmpty(Employer employer) {
		if (employer.getEmail()==null &&employer.getPassword()==null && employer.getPhoneNumber()==null && employer.getVerifyPassword()==null && employer.getWebsite()==null) {
			
			return false;
		}
		return true;
		
	}
}
