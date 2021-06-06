package com.example.HrmsProject.core.verification;

public interface VerificationService {
	void sendLink(String email);
	String sendCode();
}
