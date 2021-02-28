package com.example.apitouristspot.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.apitouristspot.models.Picture;
import com.example.apitouristspot.repository.PictureRepository;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "api/picture")
@CrossOrigin(origins = "*")
public class PictureResource {

	@Autowired
	private PictureRepository pictureRepository;
	
	@PostMapping(value = "")
	@ApiOperation(value = "Adicione foto a um ponto turístico.")
	public Picture save(@RequestBody Picture picture) {
		return pictureRepository.save(picture);
	}
	
	@DeleteMapping(value = "")
	@ApiOperation(value = "Remover fotos que adicionei a um ponto turístico.")
	public void delete(@RequestBody Picture picture) {
		pictureRepository.delete(picture);
	}
}
