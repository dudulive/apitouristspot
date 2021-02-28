package com.example.apitouristspot.resources;

import java.util.Optional;

import com.example.apitouristspot.models.FavoriteTouristSpot;
import com.example.apitouristspot.models.TouristSpot;
import com.example.apitouristspot.models.User;
import com.example.apitouristspot.repository.FavoriteTouristSpotRespository;
import com.example.apitouristspot.repository.TouristSpotRepository;
import com.example.apitouristspot.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "api/tourist-spot/favorite")
@CrossOrigin(origins = "*")
public class FavoriteTouristSpotResoucer {

    @Autowired
    private TouristSpotRepository touristSpotRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private FavoriteTouristSpotRespository favoriteTouristSpotRespository;

    @PostMapping(value = "")
    @ApiOperation(value = "favorito um ponto turístico.")
    public FavoriteTouristSpot save(@RequestBody FavoriteTouristSpot favoriteTouristSpot) {
        Optional<User> user = userRepository.findById(favoriteTouristSpot.getUser().getId());
        Optional<TouristSpot> touristSpot = touristSpotRepository.findById(favoriteTouristSpot.getTouristSpot().getId());
        favoriteTouristSpot.setUser(user.get());
        favoriteTouristSpot.setTouristSpot(touristSpot.get());
		return favoriteTouristSpotRespository.save(favoriteTouristSpot);
	}
    
}
