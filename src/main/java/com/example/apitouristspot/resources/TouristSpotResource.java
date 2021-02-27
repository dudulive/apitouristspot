package com.example.apitouristspot.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.apitouristspot.models.TouristSpot;
import com.example.apitouristspot.repository.TouristSpotRepository;

@RestController
@RequestMapping(value = "api/tourist-spot")
public class TouristSpotResource {
	
	@Autowired
	private TouristSpotRepository touristSpotRepository;
	
	@GetMapping(value = "")
	public List<TouristSpot> list(){
		return touristSpotRepository.findAll();
	}
	
	@GetMapping(value = "/{name}")
	public List<TouristSpot> findById(@PathVariable(value = "name") String name){
		return touristSpotRepository.findByName(name.trim().toUpperCase());
	}
	
	@PostMapping(value = "")
	public TouristSpot save(@RequestBody TouristSpot touristSpot) {
		return touristSpotRepository.save(touristSpot);
	}

}
