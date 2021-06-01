package com.example.HrmsProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.HrmsProject.business.abstracts.CityService;
import com.example.HrmsProject.core.utilities.results.DataResult;
import com.example.HrmsProject.core.utilities.results.Result;
import com.example.HrmsProject.core.utilities.results.SuccessDataResult;
import com.example.HrmsProject.dataAccess.abstracts.CityDao;
import com.example.HrmsProject.entities.concretes.City;

@Service
public class CityManager implements CityService{

	CityDao cityDao;
	
	@Autowired
	public CityManager(CityDao cityDao) {
		super();
		this.cityDao = cityDao;
	}

	@Override
	public Result add(City city) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result update(City city) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result delete(City city) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<City>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<City>>(this.cityDao.findAll(), "Liste başarıyla listenledndi");
	}

}
