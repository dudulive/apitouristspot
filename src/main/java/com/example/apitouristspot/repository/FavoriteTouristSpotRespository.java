package com.example.apitouristspot.repository;

import com.example.apitouristspot.models.FavoriteTouristSpot;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface FavoriteTouristSpotRespository extends JpaRepository<FavoriteTouristSpot, Long> {

    @Query(value = "SELECT f FROM FavoriteTouristSpot f where trim(f.user.username) = ?1")
	FavoriteTouristSpot findByUserName(String email);
    
}
