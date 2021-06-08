package com.example.HrmsProject.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.HrmsProject.entities.concretes.SocialMediaLink;

public interface SocialMediaLinkDao extends JpaRepository<SocialMediaLink, Integer> {
	List<SocialMediaLink> getAllByCv_id(int id);

}
