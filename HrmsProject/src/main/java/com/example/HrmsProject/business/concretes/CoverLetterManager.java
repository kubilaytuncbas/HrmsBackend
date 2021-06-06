package com.example.HrmsProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.HrmsProject.business.abstracts.CoverLetterService;
import com.example.HrmsProject.core.utilities.results.DataResult;
import com.example.HrmsProject.core.utilities.results.Result;
import com.example.HrmsProject.dataAccess.abstracts.CoverLetterDao;
import com.example.HrmsProject.entities.concretes.CoverLetter;
@Service
public class CoverLetterManager implements CoverLetterService {
	
	@Autowired
	private CoverLetterDao coverLetterDao;
	
	public CoverLetterManager(CoverLetterDao coverLetterDao) {
		super();
		this.coverLetterDao = coverLetterDao;
	}

	@Override
	public Result add(CoverLetter coverLetter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result update(CoverLetter coverLetter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result delete(CoverLetter coverLetter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<CoverLetter>> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
