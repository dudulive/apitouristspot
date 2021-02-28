package com.example.apitouristspot.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.apitouristspot.models.Picture;
import com.example.apitouristspot.repository.PictureRepository;

@RestController
@RequestMapping(value = "api/picture")
public class PictureResource {

	@Autowired
	private PictureRepository pictureRepository;
	
	@PostMapping(value = "")
	public Picture save(@RequestBody Picture picture) {
		return pictureRepository.save(picture);
	}
}
