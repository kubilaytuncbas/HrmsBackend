package com.example.HrmsProject.dataAccess.abstracts;
 
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.HrmsProject.entities.concretes.JobPosition;

public interface JobPositionDao extends JpaRepository<JobPosition, Integer> {
	
	
	List<JobPosition> findAllByJobTitle(String jobTitle);
	
}
