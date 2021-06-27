package com.example.HrmsProject.entities.concretes;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "jobseekers")
@Data
@PrimaryKeyJoinColumn(name = "user_id")
@AllArgsConstructor
@NoArgsConstructor
public class Jobseeker extends User{

//	@Id
//	@GeneratedValue
//	@Column(name= "user_id")
//	private int userId;
	
	@Column(name= "first_name")
	private String firstName;
	
	@Column(name= "last_name")
	private String lastName;
	
	@Column(name= "national_id")
	private String nationalityId;
	
	@Column(name= "date_of_birth")
	private LocalDate dateOfBirth;
	
	@Column(name = "is_verified", columnDefinition = "boolean default false")
	private boolean isVerified = false;
	
	@JsonIgnore
	@OneToMany(mappedBy = "jobseeker")
	private List<Cv> cvs;
	
	@JsonIgnore
	@OneToMany(mappedBy="jobseeker")
	private List<Favorite> favorites;
	

}