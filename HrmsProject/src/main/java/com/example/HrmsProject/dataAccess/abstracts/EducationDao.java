package com.example.HrmsProject.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.HrmsProject.entities.concretes.Education;

public interface EducationDao extends JpaRepository<Education, Integer> {
	
	Education getById(int id);
	List<Education> getAllByCv_idOrderByEndTimeDesc(int id);
	List<Education> getAllByCv_id(int id);
}
