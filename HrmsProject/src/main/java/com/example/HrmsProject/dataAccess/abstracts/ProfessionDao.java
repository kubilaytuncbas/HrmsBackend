package com.example.HrmsProject.dataAccess.abstracts;
 
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.HrmsProject.entities.concretes.Profession;

public interface ProfessionDao extends JpaRepository<Profession, Integer> {
	
	

}