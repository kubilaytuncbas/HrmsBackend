package com.example.HrmsProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.HrmsProject.business.abstracts.JobPositionService;
import com.example.HrmsProject.core.utilities.results.DataResult;
import com.example.HrmsProject.core.utilities.results.ErrorResult;
import com.example.HrmsProject.core.utilities.results.Result;
import com.example.HrmsProject.core.utilities.results.SuccessDataResult;
import com.example.HrmsProject.core.utilities.results.SuccessResult;
import com.example.HrmsProject.dataAccess.abstracts.JobPositionDao;
import com.example.HrmsProject.entities.concretes.JobPosition;


@Service
public class JobPositionManager implements JobPositionService{
	
	
	JobPositionDao jobPositionDao;	
	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}

	@Override
	public Result add(JobPosition jobPosition) {
		// TODO Auto-generated method stub
		
		if (jobPositionDao.findAllByJobTitle(jobPosition.getJobTitle()).stream().count()!=0) {
			return new ErrorResult("Aynı meslek ismini tekrar ekleyemezsiniz!!");
		}
		else {
			jobPositionDao.save(jobPosition);
			
			return new SuccessResult("Başarıyla eklendi");
		}
		
	}

	@Override
	public Result update(JobPosition jobPosition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result delete(JobPosition jobPosition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<JobPosition>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<JobPosition>>(jobPositionDao.findAll());
	}

	

}
