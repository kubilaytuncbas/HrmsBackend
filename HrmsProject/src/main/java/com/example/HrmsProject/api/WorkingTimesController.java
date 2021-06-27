package com.example.HrmsProject.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.HrmsProject.business.abstracts.WorkingTimeService;
import com.example.HrmsProject.core.utilities.results.DataResult;
import com.example.HrmsProject.core.utilities.results.Result;
import com.example.HrmsProject.core.utilities.results.SuccessResult;
import com.example.HrmsProject.entities.concretes.WorkingTime;

@CrossOrigin
@RestController
@RequestMapping("/api/workingTimes")
public class WorkingTimesController {
	
	private WorkingTimeService workingTimeService;
	
	@Autowired
	public WorkingTimesController(WorkingTimeService workingTimeService) {
		super();
		this.workingTimeService = workingTimeService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody WorkingTime workingTime) {
		return this.workingTimeService.add(workingTime);
		
	}
	
	@GetMapping("/getAll")
	public DataResult<List<WorkingTime>> getAll(){
		
		return workingTimeService.getAll();
	}
	

}
