package com.example.HrmsProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.HrmsProject.entities.concretes.SocialMediaLink;

public interface SocialMediaLinkDao extends JpaRepository<SocialMediaLink, Integer> {

}
