package com.example.HrmsProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.HrmsProject.business.abstracts.EmployerService;
import com.example.HrmsProject.core.utilities.results.DataResult;
import com.example.HrmsProject.core.utilities.results.ErrorResult;
import com.example.HrmsProject.core.utilities.results.Result;
import com.example.HrmsProject.core.utilities.results.SuccessDataResult;
import com.example.HrmsProject.core.utilities.results.SuccessResult;
import com.example.HrmsProject.dataAccess.abstracts.EmployerDao;
import com.example.HrmsProject.entities.concretes.Employer;


@Service
public class EmployerManager implements EmployerService {
	
	private EmployerDao employerDao;
	
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}

	@Override
	public Result add(Employer employer) {
		// TODO Auto-generated method stub
		if (isCheckFieldsEmpty(employer)==false) {
			return new ErrorResult("Alanlar Boş Bırakılamaz");
		}
		else if (employerDao.findAllByEmail(employer.getEmail()).stream().count()!=0) {
			return new ErrorResult("Aynı mail adresi birden fazla kullanılamaz!!!");
		}
		else if (checkPasswordAndVerifyPassword(employer)==false) {
			
			return new ErrorResult("Şifreniz birbiri ile uyuşmuyor lütfen kontrol ediniz!!");
		} 
		else 
		{
			employerDao.save(employer);
			return new SuccessResult("başarıyla eklendi");
		}
		
	}

	@Override
	public Result update(Employer employer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result delete(Employer employer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Employer>>(employerDao.findAll());
	}
	
	public boolean checkPasswordAndVerifyPassword(Employer employer) 
	{
		
		if (employer.getPassword().equals(employer.getVerifyPassword())) 
			{
				return true;
			}
				return false;
	}
	public boolean isCheckFieldsEmpty(Employer employer) {
		if (employer.getEmail()==null && employer.getPassword()==null && employer.getPhoneNumber()==null && employer.getVerifyPassword()==null && employer.getWebsite()==null) {
			
			return false;
		}
		return true;
		
	}

	@Override
	public Result employerConfirm(int id, boolean isVerified) {
		Employer tempValue=this.employerDao.findById(id).orElse(null);
		tempValue.setVerified(isVerified);
		this.employerDao.save(tempValue);
		return new SuccessResult();
	}
	
	
}
