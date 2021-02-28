package com.example.apitouristspot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.apitouristspot.models.TouristSpot;

public interface TouristSpotRepository extends JpaRepository<TouristSpot, Long> {
	
	@Query(value = "SELECT t FROM TouristSpot t where upper(trim(t.name)) = ?1")
	List<TouristSpot> findByName(String name);

}


