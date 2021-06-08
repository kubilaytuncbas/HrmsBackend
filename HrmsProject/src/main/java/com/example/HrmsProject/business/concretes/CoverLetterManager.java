package com.example.HrmsProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.HrmsProject.business.abstracts.CoverLetterService;
import com.example.HrmsProject.core.utilities.results.DataResult;
import com.example.HrmsProject.core.utilities.results.Result;
import com.example.HrmsProject.core.utilities.results.SuccessDataResult;
import com.example.HrmsProject.core.utilities.results.SuccessResult;
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
		this.coverLetterDao.save(coverLetter);
		return new SuccessResult("Ön yazı başarıyla eklendi");
	}

	@Override
	public Result update(CoverLetter coverLetter) {
		this.coverLetterDao.save(coverLetter);
		return new SuccessResult("Ön yazı başarıyla güncellendi");
		
	}

	@Override
	public Result delete(CoverLetter coverLetter) {
		this.coverLetterDao.delete(coverLetter);
		return new SuccessResult("Ön yazı başarıyla silindi");
	}

	@Override
	public DataResult<List<CoverLetter>> getAll() {
		return new SuccessDataResult<List<CoverLetter>>(this.coverLetterDao.findAll(), "Ön yazılar başarıyla listelendi");
	}

	

	@Override
	public DataResult<List<CoverLetter>> getAllByCv_id(int id) {
		return new SuccessDataResult<List<CoverLetter>>(this.coverLetterDao.getAllByCv_id(id),"Başarıyla getirildi");
	}

	

	

}
