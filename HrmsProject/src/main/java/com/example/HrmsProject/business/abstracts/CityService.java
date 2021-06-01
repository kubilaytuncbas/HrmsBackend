package com.example.HrmsProject.business.abstracts;

import java.util.List;

import com.example.HrmsProject.core.utilities.results.DataResult;
import com.example.HrmsProject.core.utilities.results.Result;
import com.example.HrmsProject.entities.concretes.City;

public interface CityService {
	
	Result add(City city);
	Result update(City city);
	Result delete(City city);
	DataResult<List<City>> getAll();
}
