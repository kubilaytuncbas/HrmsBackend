package com.example.HrmsProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.HrmsProject.entities.concretes.User;



public interface UserDao extends JpaRepository<User, Integer> {

	
	User findAllUserByEmail(String email);
}
