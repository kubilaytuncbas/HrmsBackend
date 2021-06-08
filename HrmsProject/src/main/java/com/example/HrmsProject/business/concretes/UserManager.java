package com.example.HrmsProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.HrmsProject.business.abstracts.UserService;
import com.example.HrmsProject.core.utilities.results.DataResult;
import com.example.HrmsProject.core.utilities.results.Result;
import com.example.HrmsProject.core.utilities.results.SuccessDataResult;
import com.example.HrmsProject.core.utilities.results.SuccessResult;
import com.example.HrmsProject.dataAccess.abstracts.UserDao;
import com.example.HrmsProject.entities.concretes.User;



@Service
public class UserManager implements UserService {

	
	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	
	

	@Override
	public DataResult<List<User>> getAll() {
		// TODO Auto-generated method stub
		return  new SuccessDataResult<List<User>>(userDao.findAll(),"veriler listelendi");
	}

	@Override
	public Result add(User user) {
		// TODO Auto-generated method stub
		userDao.save(user);
		return new SuccessResult("Kullanıcı başarıyla eklendi"); 
	}

	@Override
	public Result update(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result delete(User user) {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public DataResult<User> findAllUserByEmail(String email) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<User>(this.userDao.findAllUserByEmail(email));
	}

}
