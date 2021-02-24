package com.example.apitouristspot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.apitouristspot.models.Picture;

public interface PictureRepository extends JpaRepository<Picture, Long> {

}
