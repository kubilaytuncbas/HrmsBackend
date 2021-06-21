package com.example.HrmsProject.business.abstracts;

import java.util.List;

import com.example.HrmsProject.core.utilities.results.DataResult;
import com.example.HrmsProject.core.utilities.results.Result;
import com.example.HrmsProject.entities.concretes.Employee;


public interface EmployeeService {
	
	
	DataResult<List<Employee>> getAll();
	Result add(Employee employee);
	Result update(Employee employee);
	Result delete(Employee employee);
	Result employerConfirm(int id,boolean isVerified);
}
