package com.example.HrmsProject.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.HrmsProject.business.abstracts.VerificationCodeService;
import com.example.HrmsProject.core.utilities.results.Result;
import com.example.HrmsProject.core.utilities.results.SuccessResult;
import com.example.HrmsProject.dataAccess.abstracts.VerificationCodeDao;
import com.example.HrmsProject.entities.concretes.VerificationCode;
@Service
public class VerificationCodeManager  implements VerificationCodeService{

	
	VerificationCodeDao verificationCodeDao;	
	@Autowired
	public VerificationCodeManager(VerificationCodeDao verificationCodeDao) {
		super();
		this.verificationCodeDao = verificationCodeDao;
	}

	@Override
	public Result add(VerificationCode verificationCode) {
		// TODO Auto-generated method stub
		verificationCodeDao.save(verificationCode);
		return new SuccessResult();
	}

}
