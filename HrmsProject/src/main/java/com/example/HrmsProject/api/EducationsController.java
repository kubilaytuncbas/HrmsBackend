package com.example.HrmsProject.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.HrmsProject.business.abstracts.EducationService;
import com.example.HrmsProject.core.utilities.results.DataResult;
import com.example.HrmsProject.core.utilities.results.Result;
import com.example.HrmsProject.entities.concretes.Education;

@RestController
@RequestMapping("/api/educations")
public class EducationsController {
	
	private EducationService educationService;

	public EducationsController(EducationService educationService) {
		super();
		this.educationService = educationService;
	}
	@GetMapping("/getall")
	public DataResult<List<Education>> getAll()
	{
		return educationService.getAll();			
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Education education) {
		return educationService.add(education);
		
	}
	@PostMapping("/update")
	public Result update(@RequestBody Education education) {
		return educationService.update(education);
	}
	@GetMapping("/getAllByCv_idOrderByEndTimeDesc")
	public DataResult<List<Education>> getAllByCv_idOrderByEndTimeDesc(int id){
		return this.educationService.getAllByCv_idOrderByEndTimeDesc(id);
	}
	
	

}
