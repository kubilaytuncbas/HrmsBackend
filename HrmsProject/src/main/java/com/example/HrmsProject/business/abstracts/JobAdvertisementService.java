package com.example.HrmsProject.business.abstracts;

import java.util.List;


import com.example.HrmsProject.core.utilities.results.DataResult;
import com.example.HrmsProject.core.utilities.results.Result;
import com.example.HrmsProject.entities.concretes.JobAdvertisement;

public interface JobAdvertisementService {
	
	Result add(JobAdvertisement jobAdvertisement);
	Result update(JobAdvertisement jobAdvertisement);
	Result delete(JobAdvertisement jobAdvertisement);
	DataResult<List<JobAdvertisement>> getAll();
	
	DataResult<List<JobAdvertisement>> findAllOpenJobAdvertisement();
	
	
	DataResult<List<JobAdvertisement>> findAllByOrderByPublishedAtDesc();
	
	
	DataResult<List<JobAdvertisement>>findAllByJobAdvertisementByEmployer(int id);
}
