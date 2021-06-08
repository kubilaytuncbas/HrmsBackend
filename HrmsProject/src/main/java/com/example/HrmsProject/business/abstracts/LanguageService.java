package com.example.HrmsProject.business.abstracts;

import java.util.List;

import com.example.HrmsProject.core.utilities.results.DataResult;
import com.example.HrmsProject.core.utilities.results.Result;
import com.example.HrmsProject.entities.concretes.Language;

public interface LanguageService {
	Result add(Language language);
	Result update(Language language);
	Result delete(Language language);
	DataResult<List<Language>> getAll();
	DataResult<List<Language>> getAllByCv_id(int id);
	
}
