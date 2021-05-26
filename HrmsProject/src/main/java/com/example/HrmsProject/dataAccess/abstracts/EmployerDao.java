package com.example.HrmsProject.dataAccess.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;


import com.example.HrmsProject.entities.concretes.Employer;


public interface EmployerDao extends JpaRepository<Employer,Integer >{
	
	

}
