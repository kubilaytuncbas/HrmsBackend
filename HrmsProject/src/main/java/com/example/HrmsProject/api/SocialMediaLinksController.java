package com.example.HrmsProject.api;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.HrmsProject.business.abstracts.SocialMediaLinkService;
import com.example.HrmsProject.core.utilities.results.DataResult;
import com.example.HrmsProject.core.utilities.results.Result;
import com.example.HrmsProject.entities.concretes.SocialMediaLink;

@RestController
@RequestMapping("/api/socialMediaLinks")
@CrossOrigin
public class SocialMediaLinksController {
	private SocialMediaLinkService socialMediaLinkService;

	public SocialMediaLinksController(SocialMediaLinkService socialMediaLinkService) {
		super();
		this.socialMediaLinkService = socialMediaLinkService;
	}
	@GetMapping("/getall")
	public DataResult<List<SocialMediaLink>> getAll()
	{
		return socialMediaLinkService.getAll();			
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody SocialMediaLink socialMediaLink) {
		return socialMediaLinkService.add(socialMediaLink);
		
	}
	@PostMapping("/update")
	public Result update(@RequestBody SocialMediaLink socialMediaLink) {
		return socialMediaLinkService.update(socialMediaLink);
	}
	@PostMapping("/delete")
	public Result delete(@RequestParam int id) {
		return this.socialMediaLinkService.delete(id);
	}
	
	DataResult<List<SocialMediaLink>> getAllByCv_id(int id){
		return this.socialMediaLinkService.getAllByCv_id(id);
		
	}

}
