package com.example.HrmsProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.HrmsProject.business.abstracts.CvService;
import com.example.HrmsProject.core.utilities.results.DataResult;
import com.example.HrmsProject.core.utilities.results.Result;
import com.example.HrmsProject.dataAccess.abstracts.CvDao;
import com.example.HrmsProject.entities.concretes.Cv;

@Service
public class CvManager implements CvService {

	private CvDao cvDao;
	
	@Autowired
	public CvManager(CvDao cvDao) {
		super();
		this.cvDao = cvDao;
	}

	@Override
	public Result add(Cv cv) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result update(Cv cv) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result delete(Cv cv) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<Cv>> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
