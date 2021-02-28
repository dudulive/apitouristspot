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

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "api/tourist-spot")
public class TouristSpotResource {
	
	@Autowired
	private TouristSpotRepository touristSpotRepository;
	
	@GetMapping(value = "")
	@ApiOperation(value = "Veja uma lista de pontos turísticos.")
	public List<TouristSpot> list(){
		return touristSpotRepository.findAll();
	}
	
	@GetMapping(value = "/{name}")
	@ApiOperation(value = "Procure pontos turísticos pelo nome.")
	public List<TouristSpot> findById(@PathVariable(value = "name") String name){
		return touristSpotRepository.findByName(name.trim().toUpperCase());
	}
	
	@PostMapping(value = "")
	@ApiOperation(value = "Registrar um ponto turístico.")
	public TouristSpot save(@RequestBody TouristSpot touristSpot) {
		return touristSpotRepository.save(touristSpot);
	}

}
