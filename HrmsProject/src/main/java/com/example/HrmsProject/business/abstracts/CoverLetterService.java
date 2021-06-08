package com.example.HrmsProject.business.abstracts;

import java.util.List;

import com.example.HrmsProject.core.utilities.results.DataResult;
import com.example.HrmsProject.core.utilities.results.Result;
import com.example.HrmsProject.entities.concretes.CoverLetter;

public interface CoverLetterService {
	Result add(CoverLetter coverLetter);
	Result update(CoverLetter coverLetter);
	Result delete(CoverLetter coverLetter);
	DataResult<List<CoverLetter>> getAll();
	DataResult<List<CoverLetter>> getAllByCv_id(int id);

}
