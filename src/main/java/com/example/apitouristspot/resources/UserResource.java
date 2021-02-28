package com.example.apitouristspot.resources;

import com.example.apitouristspot.models.User;
import com.example.apitouristspot.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "api/user")
@CrossOrigin(origins = "*")
public class UserResource {

    @Autowired
    private UserRepository userRepository;

    @PostMapping(value = "")
	@ApiOperation(value = "Cadastrar usuario.")
	public User save(@RequestBody User user) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
		return userRepository.save(user);
	}
}
