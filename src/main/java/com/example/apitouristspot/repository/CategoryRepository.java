package com.example.apitouristspot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.apitouristspot.models.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {


}
