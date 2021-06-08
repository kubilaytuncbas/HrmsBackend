package com.example.HrmsProject.entities.dtos;

import java.util.List;



import com.example.HrmsProject.entities.concretes.CoverLetter;
import com.example.HrmsProject.entities.concretes.Cv;
import com.example.HrmsProject.entities.concretes.Education;
import com.example.HrmsProject.entities.concretes.Experience;
import com.example.HrmsProject.entities.concretes.Image;
import com.example.HrmsProject.entities.concretes.Jobseeker;
import com.example.HrmsProject.entities.concretes.Language;
import com.example.HrmsProject.entities.concretes.Skill;
import com.example.HrmsProject.entities.concretes.SocialMediaLink;


public class CvDto {
	
	public Cv cv;
	
	public Jobseeker jobseeker;
	
	
	public List<Education> educations;
	
	
	public List<Skill> skills;
	
	
	public List<CoverLetter> coverLetters;
	
	
	public List<Experience> experiences;
	
	
	public List<Language> languages;
	
	
	public List<SocialMediaLink> socialMediaLinks;
	
	public  Image image;

}
