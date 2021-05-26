package com.example.HrmsProject.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.HrmsProject.business.abstracts.JobSeekerService;
import com.example.HrmsProject.core.utilities.results.DataResult;
import com.example.HrmsProject.core.utilities.results.Result;
import com.example.HrmsProject.entities.concretes.Jobseeker;


@RestController
@RequestMapping("/api/jobSeekers")
public class JobSeekersController {
	
	private JobSeekerService jobSeekerService;
	
	@Autowired
	public JobSeekersController(JobSeekerService jobSeekerService) {
		super();
		this.jobSeekerService = jobSeekerService;
	}
	@GetMapping("/getall")
	public DataResult<List<Jobseeker>> getAll()
	{
		return jobSeekerService.getAll();			
	}
	

	@PostMapping("/add")
	public Result add(@RequestBody Jobseeker jobSeeker) {
		
		return jobSeekerService.add(jobSeeker);
	}

}
