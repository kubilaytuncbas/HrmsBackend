package com.example.HrmsProject.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.HrmsProject.business.abstracts.WorkingTypeService;
import com.example.HrmsProject.core.utilities.results.DataResult;
import com.example.HrmsProject.core.utilities.results.Result;
import com.example.HrmsProject.core.utilities.results.SuccessResult;
import com.example.HrmsProject.entities.concretes.WorkingType;

@CrossOrigin
@RestController
@RequestMapping("/api/workingTypes")
public class WorkingTypesController {
	
	private WorkingTypeService workingTypeService;
	
	@Autowired
	public WorkingTypesController(WorkingTypeService workingTypeService) {
		super();
		this.workingTypeService = workingTypeService;
	}
	
	@PostMapping("/add")
	public Result add(WorkingType workingType) {
		this.workingTypeService.add(workingType);
		return new SuccessResult();
	}
	@GetMapping("/getAll")
	public DataResult<List<WorkingType>> getAll(){
		return this.workingTypeService.getAll();
	}
	

}
