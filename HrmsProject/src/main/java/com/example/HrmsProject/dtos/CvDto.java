package com.example.HrmsProject.dtos;

import java.util.List;



import com.example.HrmsProject.entities.concretes.CoverLetter;
import com.example.HrmsProject.entities.concretes.Education;
import com.example.HrmsProject.entities.concretes.Experience;
import com.example.HrmsProject.entities.concretes.Jobseeker;
import com.example.HrmsProject.entities.concretes.Language;
import com.example.HrmsProject.entities.concretes.Skill;
import com.example.HrmsProject.entities.concretes.SocialMediaLink;


public class CvDto {
	
	
	private Jobseeker jobseeker;
	
	
	private List<Education> educations;
	
	
	private List<Skill> skills;
	
	
	private List<CoverLetter> coverLetters;
	
	
	private List<Experience> experiences;
	
	
	private List<Language> languages;
	
	
	private List<SocialMediaLink> socialMediaLinks;

}
