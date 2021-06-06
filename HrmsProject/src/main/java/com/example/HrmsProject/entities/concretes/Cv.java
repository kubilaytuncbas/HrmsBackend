package com.example.HrmsProject.entities.concretes;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@Table(name="cvs")
@AllArgsConstructor
@NoArgsConstructor
public class Cv {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="created_at", columnDefinition = "Date defult CURRENT_DATE")
	private LocalDate createdAt=LocalDate.now();
	
	@Column(name="is_active", columnDefinition = "boolean default true")
	private boolean isActive;
	
	@Column(name="is_deleted", columnDefinition = "boolean default false")
	private boolean isDeleted;
	
	
	@ManyToOne()
	@JoinColumn(name="jobseeker_id")
	private Jobseeker jobseeker;
	
	@JsonIgnore
	@OneToMany(mappedBy="cv")
	private List<Education> educations;
	
	@JsonIgnore
	@OneToMany(mappedBy ="cv")
	private List<Skill> skills;
	
	@JsonIgnore
	@OneToMany(mappedBy = "cv")
	private List<CoverLetter> coverLetters;
	
	@JsonIgnore
	@OneToMany(mappedBy = "cv")
	private List<Experience> experiences;
	
	@JsonIgnore
	@OneToMany(mappedBy = "cv")
	private List<Language> languages;
	
	@JsonIgnore
	@OneToMany(mappedBy ="cv")
	private List<SocialMediaLink> socialMediaLinks;
	
	@OneToOne(mappedBy = "cv",cascade = CascadeType.ALL)
	private Image image;

}
