package com.example.apitouristspot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.apitouristspot.models.TouristSpot;

public interface TouristSpotRepository extends JpaRepository<TouristSpot, Long> {

}
