package com.example.apitouristspot.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.apitouristspot.models.Category;
import com.example.apitouristspot.repository.CategoryRepository;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "api/category")
@CrossOrigin(origins = "*")
public class CategoryResource {

	@Autowired
	CategoryRepository categoryRepository;
	
	@GetMapping(value = "")
	@ApiOperation(value = "Retorna lista de categorias de pontos turísticos.")
	public List<Category> list(){
		return categoryRepository.findAll();
	}
	
	@GetMapping(value = "/{id}")
	@ApiOperation(value = "Retorna lista de categorias de pontos turísticos buscando pelo id.")
	public Optional<Category> findById(@PathVariable(value = "id") Long id){
		return categoryRepository.findById(id);
	}
	
	@PostMapping(value = "")
	@ApiOperation(value = "Cadastrar nova categoria de pontos turísticos.")
	public Category save(@RequestBody Category category) {
		return categoryRepository.save(category);
	}
}
