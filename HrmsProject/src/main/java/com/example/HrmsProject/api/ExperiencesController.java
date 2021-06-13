package com.example.HrmsProject.api;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.HrmsProject.business.abstracts.ExperienceService;
import com.example.HrmsProject.core.utilities.results.DataResult;
import com.example.HrmsProject.core.utilities.results.Result;
import com.example.HrmsProject.entities.concretes.Experience;

@RestController
@RequestMapping("/api/experiences")
@CrossOrigin
public class ExperiencesController {
	private ExperienceService experienceService;

	public ExperiencesController(ExperienceService experienceService) {
		super();
		this.experienceService = experienceService;
	}
	@GetMapping("/getall")
	public DataResult<List<Experience>> getAll()
	{
		return experienceService.getAll();			
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Experience experience) {
		return experienceService.add(experience);
		
	}
	@PostMapping("/update")
	public Result update(@RequestBody Experience experience) {
		return experienceService.update(experience);
	}
	@PostMapping("/delete")
	public Result Delete(@RequestParam int id) {
		return experienceService.delete(id);
	}
	@GetMapping("/getAllByCv_idOrderByEndAtDesc")
	public DataResult<List<Experience>> getAllByCv_idOrderByEndAtDesc(int id){
		return experienceService.getAllByCv_idOrderByEndAtDesc(id);
	}
	@GetMapping("/getAllByCv_id")
	public DataResult<List<Experience>> getAllByCv_id(int id){
		return experienceService.getAllByCv_id(id);
	}
	
	

}
