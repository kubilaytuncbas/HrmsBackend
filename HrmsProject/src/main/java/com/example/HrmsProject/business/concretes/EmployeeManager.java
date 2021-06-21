package com.example.HrmsProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.HrmsProject.business.abstracts.EmployeeService;
import com.example.HrmsProject.business.abstracts.EmployerService;
import com.example.HrmsProject.core.utilities.results.DataResult;
import com.example.HrmsProject.core.utilities.results.Result;
import com.example.HrmsProject.core.utilities.results.SuccessDataResult;
import com.example.HrmsProject.core.utilities.results.SuccessResult;
import com.example.HrmsProject.dataAccess.abstracts.EmployeeDao;
import com.example.HrmsProject.entities.concretes.Employee;

@Service
public class EmployeeManager implements EmployeeService {
	
	private EmployeeDao employeeDao;
	private EmployerService employerService;
	
	@Autowired
	public EmployeeManager(EmployeeDao employeeDao, EmployerService employerService) {
		super();
		this.employeeDao = employeeDao;
		this.employerService = employerService;
	}


	@Override
	public DataResult<List<Employee>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Employee>>(employeeDao.findAll());
	}

	@Override
	public Result add(Employee employee) {
		// TODO Auto-generated method stub
		employeeDao.save(employee);
		
		return new SuccessResult("başarıyla eklendi");
	}

	@Override
	public Result update(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result delete(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result employerConfirm(int id, boolean isVerified) {
		employerService.employerConfirm(id, isVerified);
		return null;
	}
	

	
	
	

}
