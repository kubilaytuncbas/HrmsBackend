package com.example.HrmsProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.HrmsProject.business.abstracts.ProfessionService;
import com.example.HrmsProject.dataAccess.abstracts.ProfessionDao;
import com.example.HrmsProject.entities.concretes.Profession;

@Service
public class ProfessionManager implements ProfessionService{
	
	
	ProfessionDao professionDao;
	
	@Autowired
	public ProfessionManager(ProfessionDao professionDao) {
		super();
		this.professionDao = professionDao;
	}

	@Override
	public List<Profession> getAll() {
		// TODO Auto-generated method stub
		return professionDao.findAll();
	}

}
