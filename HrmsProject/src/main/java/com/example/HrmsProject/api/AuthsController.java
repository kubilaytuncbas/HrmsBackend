package com.example.HrmsProject.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.HrmsProject.business.abstracts.AuthService;
import com.example.HrmsProject.core.utilities.results.Result;
import com.example.HrmsProject.entities.concretes.Employer;
import com.example.HrmsProject.entities.concretes.Jobseeker;

@RestController
@RequestMapping("/api/auths")
@CrossOrigin
public class AuthsController {
	private AuthService authService;
	
	@Autowired
	public AuthsController(AuthService authService) {
		super();
		this.authService = authService;
	}
	@PostMapping("/registerEmployer")
	public Result registerEmployer(@RequestBody Employer employer) {
		
		return authService.registerWithEmployer(employer);
	}
	
	
	@PostMapping("/registerJobSeeker")
	public Result registerJobSeeker(@RequestBody Jobseeker jobSeeker) {
		
		return authService.registerWithJobSeeker(jobSeeker);
		
	}
	
	

}
