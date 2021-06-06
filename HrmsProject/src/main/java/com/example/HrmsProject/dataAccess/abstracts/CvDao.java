package com.example.HrmsProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.HrmsProject.entities.concretes.Cv;

public interface CvDao extends JpaRepository<Cv, Integer>{
	
	Cv getById(int id);

}
