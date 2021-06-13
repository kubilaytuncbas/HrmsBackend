package com.example.HrmsProject.api;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.HrmsProject.business.abstracts.CoverLetterService;
import com.example.HrmsProject.core.utilities.results.DataResult;
import com.example.HrmsProject.core.utilities.results.Result;
import com.example.HrmsProject.entities.concretes.CoverLetter;

@RestController
@RequestMapping("/api/coverLetters")
@CrossOrigin
public class CoverLettersController {
	
	private CoverLetterService coverLetterService;

	public CoverLettersController(CoverLetterService coverLetterService) {
		super();
		this.coverLetterService = coverLetterService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<CoverLetter>> getAll()
	{
		return coverLetterService.getAll();			
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody CoverLetter coverLetter) {
		return coverLetterService.add(coverLetter);
		
	}
	@PostMapping("/update")
	Result update(@RequestBody CoverLetter coverLetter) {
		return coverLetterService.update(coverLetter);
	}
	@PostMapping("/delete")
	Result delete(@RequestParam int id) {
		return coverLetterService.delete(id);
	}
	@GetMapping("/getAllByCv_id")
	DataResult<List<CoverLetter>> getAllByCv_id(int id){
		return coverLetterService.getAllByCv_id(id);
		
	}
}
