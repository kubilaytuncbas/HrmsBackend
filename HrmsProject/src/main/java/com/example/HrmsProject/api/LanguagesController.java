package com.example.HrmsProject.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.HrmsProject.business.abstracts.LanguageService;
import com.example.HrmsProject.core.utilities.results.DataResult;
import com.example.HrmsProject.core.utilities.results.Result;
import com.example.HrmsProject.entities.concretes.Language;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {

	private LanguageService languageService;

	public LanguagesController(LanguageService languageService) {
		super();
		this.languageService = languageService;
	}
	@GetMapping("/getall")
	public DataResult<List<Language>> getAll()
	{
		return languageService.getAll();			
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Language language) {
		return languageService.add(language);
		
	}
	@PostMapping("/update")
	public Result update(@RequestBody Language language) {
		return languageService.update(language);
	}
	@PostMapping("/delete")
	public Result delete(@RequestParam int id) {
		return this.languageService.delete(id);
	}
	@GetMapping("/getAllByCv_id")
	DataResult<List<Language>> getAllByCv_id(int id){
		return this.languageService.getAllByCv_id(id);
	}
}
