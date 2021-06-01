package com.example.HrmsProject.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.HrmsProject.entities.concretes.JobAdvertisement;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer>{
	
	@Query("From JobAdvertisement where isOpen=true")
	List<JobAdvertisement> findAllOpenJobAdvertisement();
	
	@Query("From JobAdvertisement where isOpen=true Order By publishedAt Desc")
	List<JobAdvertisement> findAllByOrderByPublishedAtDesc();
	
	@Query("From JobAdvertisement where isOpen=true and employer_id=:id")
	List<JobAdvertisement> findAllByJobAdvertisementByEmployer(int id);
	
}
