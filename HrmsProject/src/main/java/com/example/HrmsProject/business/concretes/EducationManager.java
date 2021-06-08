package com.example.HrmsProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.HrmsProject.business.abstracts.EducationService;
import com.example.HrmsProject.core.utilities.results.DataResult;
import com.example.HrmsProject.core.utilities.results.Result;
import com.example.HrmsProject.core.utilities.results.SuccessDataResult;
import com.example.HrmsProject.core.utilities.results.SuccessResult;
import com.example.HrmsProject.dataAccess.abstracts.EducationDao;
import com.example.HrmsProject.entities.concretes.Education;


@Service
public class EducationManager implements EducationService {

	private EducationDao educationDao;
	
	@Autowired
	public EducationManager(EducationDao educationDao) {
		super();
		this.educationDao = educationDao;
	}

	@Override
	public Result add(Education education) {
		this.educationDao.save(education);
		return new SuccessResult("Başarıyla eklendi");
	}

	@Override
	public Result update(Education education) {
		this.educationDao.save(education);
		return new SuccessResult("Başarıyla güncellendi.");
	}

	@Override
	public Result delete(int id) {
		this.educationDao.deleteById(id);
		return new SuccessResult("Başarıyla silindi.");
	}

	@Override
	public DataResult<List<Education>> getAll() {
		return new SuccessDataResult<List<Education>>(this.educationDao.findAll(), "başarıyla listelendi");
	}



	@Override
	public DataResult<List<Education>> getAllByCv_idOrderByEndTimeDesc(int id) {
		return new SuccessDataResult<List<Education>>(this.educationDao.getAllByCv_idOrderByEndTimeDesc(id), "Başarıyla listelendi");
	}

	@Override
	public DataResult<List<Education>> getAllByCv_id(int id) {
		return new SuccessDataResult<List<Education>>(this.educationDao.getAllByCv_id(id), "Başarıyla listelendi");
	}

}
