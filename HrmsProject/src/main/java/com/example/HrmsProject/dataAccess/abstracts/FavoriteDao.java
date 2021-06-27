package com.example.HrmsProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.HrmsProject.entities.concretes.Favorite;

public interface FavoriteDao extends JpaRepository<Favorite, Integer> {

}
