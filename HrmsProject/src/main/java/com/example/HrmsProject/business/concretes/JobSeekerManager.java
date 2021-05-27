package com.example.HrmsProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.HrmsProject.business.abstracts.JobSeekerService;
import com.example.HrmsProject.core.EmailRegex;
import com.example.HrmsProject.core.utilities.results.DataResult;

import com.example.HrmsProject.core.utilities.results.ErrorResult;
import com.example.HrmsProject.core.utilities.results.Result;
import com.example.HrmsProject.core.utilities.results.SuccessDataResult;
import com.example.HrmsProject.core.utilities.results.SuccessResult;
import com.example.HrmsProject.dataAccess.abstracts.JobSeekerDao;
import com.example.HrmsProject.entities.concretes.Jobseeker;


@Service
public class JobSeekerManager implements JobSeekerService {

	
	JobSeekerDao jobSeekerDao;
	
	@Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao) {
		super();
		this.jobSeekerDao = jobSeekerDao;
	}

	@Override
	public Result add(Jobseeker jobSeeker) {
		// TODO Auto-generated method stub

		if (checkFirstAndLastName(jobSeeker, jobSeeker)==false) {
			
			return new ErrorResult("İsim veya Soyisim Boş Bırakılamaz");
		}
		
		else if (EmailRegex.isEmailValid(jobSeeker.getEmail())==false) {
			
			return new ErrorResult("Email adresinizi yanlış girdiniz, lütfen kontrol ediniz!");
			
		}
		
		else if (checkPasswordAndVerifyPassword(jobSeeker)==false) {
			
			return new ErrorResult("Şifre uyuşmazlığı var lütfen tekrar kontrol edin.");
			
		}
		
		else if(jobSeekerDao.findAllByEmail(jobSeeker.getEmail()).stream().count() != 0) {
			
			return new ErrorResult("Aynı email ile birden fazla kayıt yapılamaz");
			
		}
		
//		else if (jobSeekerDao.findAllByNationalityIdAndBirthYear(jobSeeker.getNationalId(), jobSeeker.getDateOfBirth()).stream().count()!=0) {
//			
//			return new ErrorResult("Böyle bir kişi bulunmamakta");
//			
//		}
		
		else if (jobSeekerDao.findAllByNationalityId(jobSeeker.getNationalityId()).stream().count()!=0) {
			
			return new ErrorResult("Aynı T.C. kimlik numarası birden fazla kullanılamaz");
		}
		
		else if (isCheckFieldsEmpty(jobSeeker)==false) {
			
			return new ErrorResult("Hiçbir Alan Boş Bırakılamaz!!");
			
		}
		
		else 
		{
			
		jobSeekerDao.save(jobSeeker);
		return new SuccessResult("Başarıyla eklendi");
		
		}
		
		
	}

	@Override
	public Result update(Jobseeker jobSeeker) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result delete(Jobseeker jobSeeker) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<Jobseeker>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Jobseeker>>(jobSeekerDao.findAll());
	}
	
	
	public boolean checkFirstAndLastName(Jobseeker firstName,Jobseeker lastName) {
		if (firstName.getFirstName()==null || lastName.getLastName()==null) {
			return false;
		
		}
		return true;
	}
	public boolean checkPasswordAndVerifyPassword(Jobseeker jobSeeker) {
		
		if (jobSeeker.getPassword().equals(jobSeeker.getVerifyPassword())) {
			
			return true;
		}
		return false;
	}
	public boolean isCheckFieldsEmpty(Jobseeker jobSeeker) {
		if (jobSeeker.getEmail()==null && jobSeeker.getPassword()==null && jobSeeker.getVerifyPassword()==null) {
			
			return false;
		}
		return true;
		
	}
	
	

	
}
