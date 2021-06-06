package com.example.HrmsProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.HrmsProject.entities.concretes.Image;


public interface ImageDao extends JpaRepository<Image, Integer> {
	
	Image  getById(int id);
	Image  getByCv_id(int id);

}
