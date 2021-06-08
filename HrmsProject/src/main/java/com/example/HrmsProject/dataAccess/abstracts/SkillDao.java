package com.example.HrmsProject.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.HrmsProject.entities.concretes.Language;
import com.example.HrmsProject.entities.concretes.Skill;

public interface SkillDao extends JpaRepository<Skill, Integer> {
	
	List<Skill> getAllByCv_id(int id);
}
