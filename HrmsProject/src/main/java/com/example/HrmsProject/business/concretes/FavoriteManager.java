package com.example.HrmsProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.HrmsProject.business.abstracts.FavoriteService;
import com.example.HrmsProject.core.utilities.results.DataResult;
import com.example.HrmsProject.core.utilities.results.Result;
import com.example.HrmsProject.core.utilities.results.SuccessDataResult;
import com.example.HrmsProject.core.utilities.results.SuccessResult;
import com.example.HrmsProject.dataAccess.abstracts.FavoriteDao;
import com.example.HrmsProject.entities.concretes.Favorite;



@Service
public class FavoriteManager implements FavoriteService {
	
	private FavoriteDao favoriteDao;
	
	
	@Autowired
	public FavoriteManager(FavoriteDao favoriteDao) {
		super();
		this.favoriteDao = favoriteDao;
	}

	@Override
	public Result add(Favorite favorite) {
		this.favoriteDao.save(favorite);
		return new SuccessResult();
	}

	@Override
	public Result update(Favorite favorite) {
		this.favoriteDao.save(favorite);
		return new SuccessResult();
	}

	@Override
	public Result delete(int id) {
		this.favoriteDao.deleteById(id);
		return new SuccessResult();
	}

	@Override
	public DataResult<List<Favorite>> getAll() {
		return new SuccessDataResult<List<Favorite>>(this.favoriteDao.findAll());
	}

}
