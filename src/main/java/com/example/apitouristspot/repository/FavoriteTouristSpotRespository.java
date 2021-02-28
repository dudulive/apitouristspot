package com.example.apitouristspot.repository;

import com.example.apitouristspot.models.FavoriteTouristSpot;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FavoriteTouristSpotRespository extends JpaRepository<FavoriteTouristSpot, Long> {
    
}
