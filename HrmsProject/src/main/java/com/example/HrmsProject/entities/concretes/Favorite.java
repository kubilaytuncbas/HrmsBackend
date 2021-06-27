package com.example.HrmsProject.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="favorites")
public class Favorite {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	@Column(name = "created_at",columnDefinition = "Date defult CURRENT_DATE")
	private LocalDate createdAt= LocalDate.now();
	
	@ManyToOne()
	@JoinColumn(name="jobseeker_id")
	private Jobseeker jobseeker;
	
	@ManyToOne()
	@JoinColumn(name="job_advertisement_id")
	private JobAdvertisement jobAdvertisement;

}
