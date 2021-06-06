package com.example.HrmsProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.HrmsProject.business.abstracts.LanguageService;
import com.example.HrmsProject.core.utilities.results.DataResult;
import com.example.HrmsProject.core.utilities.results.Result;
import com.example.HrmsProject.dataAccess.abstracts.LanguageDao;
import com.example.HrmsProject.entities.concretes.Language;
@Service
public class LanguageManager implements LanguageService {

	private LanguageDao languageDao;
	
	@Autowired
	public LanguageManager(LanguageDao languageDao) {
		super();
		this.languageDao = languageDao;
	}

	@Override
	public Result add(Language language) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result update(Language language) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result delete(Language language) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<Language>> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
