package com.example.HrmsProject.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.HrmsProject.business.abstracts.SkillService;
import com.example.HrmsProject.core.utilities.results.DataResult;
import com.example.HrmsProject.core.utilities.results.Result;
import com.example.HrmsProject.entities.concretes.Skill;

@RestController
@RequestMapping("/api/skills")
public class SkillsController {
	private SkillService skillService;

	public SkillsController(SkillService skillService) {
		super();
		this.skillService = skillService;
	}
	@GetMapping("/getall")
	public DataResult<List<Skill>> getAll()
	{
		return skillService.getAll();			
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Skill skil) {
		return skillService.add(skil);
		
	}
	@PostMapping("/update")
	public Result update(@RequestBody Skill skill) {
		return skillService.update(skill);
	}
	@GetMapping("/getAllByCv_id")
	DataResult<List<Skill>> getAllByCv_id(int id){
		return this.getAllByCv_id(id);
		
	}

}
