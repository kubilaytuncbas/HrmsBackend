package com.example.HrmsProject.dataAccess.abstracts;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.HrmsProject.entities.concretes.Jobseeker;


public interface JobSeekerDao extends JpaRepository<Jobseeker, Integer>{

	List<Jobseeker> findAllByEmail(String email);
	List<Jobseeker> findAllByNationalityId(String nationalityId);
	Jobseeker getById(int id);
	//List<Jobseeker> findAllByNationalityIdAndBirthYear(String nationalityId,LocalDate dateOfBirth);
	
	
}
