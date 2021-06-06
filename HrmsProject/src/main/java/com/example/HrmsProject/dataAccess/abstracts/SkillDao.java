package com.example.HrmsProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.HrmsProject.entities.concretes.Skill;

public interface SkillDao extends JpaRepository<Skill, Integer> {

}
