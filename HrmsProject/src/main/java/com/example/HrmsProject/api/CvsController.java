package com.example.HrmsProject.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.HrmsProject.business.abstracts.CvService;
import com.example.HrmsProject.core.utilities.results.DataResult;
import com.example.HrmsProject.core.utilities.results.Result;
import com.example.HrmsProject.entities.concretes.Cv;
import com.example.HrmsProject.entities.dtos.CvDto;

@RestController
@RequestMapping("/api/cvs")
public class CvsController {
	
	private CvService cvService;

	public CvsController(CvService cvService) {
		super();
		this.cvService = cvService;
	}
	@GetMapping("/getall")
	public DataResult<List<Cv>> getAll()
	{
		return cvService.getAll();			
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Cv cv) {
		return cvService.add(cv);
		
	}
	@PostMapping("/update")
	public Result update(@RequestBody Cv cv) {
		return cvService.update(cv);
	}
	@PostMapping("/delete")
	public Result delete(@RequestParam int id) {
		
		return cvService.delete(id);
	}
	
	@GetMapping("/getById")
	DataResult<Cv> getById(int id){
		return cvService.getById(id);
	}
	@GetMapping("/getCvById")
	DataResult<CvDto> getCvById(int id){
		return cvService.getCvById(id);
	}
	
	
	
}
