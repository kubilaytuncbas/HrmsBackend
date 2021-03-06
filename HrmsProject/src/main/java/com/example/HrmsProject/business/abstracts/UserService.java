package com.example.HrmsProject.business.abstracts;

import java.util.List;

import com.example.HrmsProject.core.utilities.results.DataResult;
import com.example.HrmsProject.core.utilities.results.Result;
import com.example.HrmsProject.entities.concretes.User;


public interface UserService {
	DataResult<List<User>> getAll();
	Result add(User user);
	Result update(User user);
	Result delete(User user);
	DataResult<User> findAllUserByEmail(String email);
}
