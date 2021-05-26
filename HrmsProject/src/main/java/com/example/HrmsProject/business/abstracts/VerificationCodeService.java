package com.example.HrmsProject.business.abstracts;

import com.example.HrmsProject.core.utilities.results.Result;
import com.example.HrmsProject.entities.concretes.VerificationCode;

public interface VerificationCodeService {
	
	Result add(VerificationCode verificationCode);
}
