package com.example.HrmsProject.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="job_positions")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobPosition {

	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="job_title")
	private String jobTitle;
	
	@Column(name= "created_at", columnDefinition = "Date default CURRENT_DATE")
	private LocalDate createdDate = LocalDate.now();
	
	
		
}
