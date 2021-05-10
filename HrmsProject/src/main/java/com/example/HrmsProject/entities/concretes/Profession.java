package com.example.HrmsProject.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Professions")
public class Profession{
	
	
	@Id
	@GeneratedValue
	@Column(name="Id")
	private int Id;
	
	@Column(name="profession_name")
	private String ProfessionName;
	
	
	
	public  Profession() {
		
		
	}



	public Profession(int id, String professionName) {
		super();
		Id = id;
		ProfessionName = professionName;
	}



	public int getId() {
		return Id;
	}



	public void setId(int id) {
		Id = id;
	}



	public String getProfessionName() {
		return ProfessionName;
	}



	public void setProfessionName(String professionName) {
		ProfessionName = professionName;
	}

	

	
	
	
}
