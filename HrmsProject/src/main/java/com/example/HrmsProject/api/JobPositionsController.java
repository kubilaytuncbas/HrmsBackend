package com.example.HrmsProject.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.HrmsProject.business.abstracts.JobPositionService;
import com.example.HrmsProject.core.utilities.results.DataResult;
import com.example.HrmsProject.core.utilities.results.Result;
import com.example.HrmsProject.entities.concretes.JobPosition;


@RestController
@RequestMapping("/api/jobPositions")
public class JobPositionsController {

	private JobPositionService jobPositionService;
	
		@Autowired
		public JobPositionsController(JobPositionService jobPositionService) {
			super();
			this.jobPositionService = jobPositionService;
		}

		@GetMapping("/getall")
		public DataResult<List<JobPosition>> getAll()
		{
			return jobPositionService.getAll();			
		}
		
		@PostMapping("/add")
		public Result add(@RequestBody JobPosition jobPosition) {
			return jobPositionService.add(jobPosition);
			
		}
}
