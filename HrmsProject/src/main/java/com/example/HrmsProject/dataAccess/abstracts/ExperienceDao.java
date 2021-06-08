package com.example.HrmsProject.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.HrmsProject.entities.concretes.Experience;

public interface ExperienceDao extends JpaRepository<Experience, Integer> {
	
	List<Experience> getAllByCv_idOrderByEndAtDesc(int id);
	List<Experience> getAllByCv_id(int id);
}
