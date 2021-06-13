package com.example.HrmsProject.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.HrmsProject.business.abstracts.JobAdvertisementService;
import com.example.HrmsProject.core.utilities.results.DataResult;
import com.example.HrmsProject.core.utilities.results.Result;
import com.example.HrmsProject.entities.concretes.JobAdvertisement;


@RestController
@RequestMapping("/api/jobAdvertisements")
@CrossOrigin
public class JobAdvertisementsController {

	JobAdvertisementService jobAdvertisementService;
	
	@Autowired
	public JobAdvertisementsController(JobAdvertisementService jobAdvertisementService) {
		super();
		this.jobAdvertisementService = jobAdvertisementService;
	}
	
	
	@PostMapping("/add")
	public Result add(@RequestBody JobAdvertisement jobAdvertisement) {
		return jobAdvertisementService.add(jobAdvertisement);
	}
	@PostMapping("/delete")
	public Result delete(@RequestParam int id) {
		return jobAdvertisementService.delete(id);
	}
	@GetMapping("/getAll")
	public DataResult<List<JobAdvertisement>> getall(){
		return jobAdvertisementService.getAll();
	}
	@GetMapping("/getAllOpenJob")
	public DataResult<List<JobAdvertisement>> findAllOpenJobAdvertisement(){
		return jobAdvertisementService.findAllOpenJobAdvertisement();
	}
	@GetMapping("/getAllOrderByPublishedDesc")
	public DataResult<List<JobAdvertisement>> findAllByOrderByPublishedAtDesc(){
		return jobAdvertisementService.findAllByOrderByPublishedAtDesc();
	}
	@GetMapping("/getAllByEmployerId")
	public DataResult<List<JobAdvertisement>> findAllByJobAdvertisementByEmployer(int id){
		return jobAdvertisementService.findAllByJobAdvertisementByEmployer(id);
	}
}
