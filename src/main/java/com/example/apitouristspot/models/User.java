package com.example.apitouristspot.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name= "TB_USER")
public class User {
	
	@Id
	@SequenceGenerator(name = "TB_USER_SEQ", sequenceName = "TB_USER_ID_USER_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TB_USER_ID_USER_SEQ")
	@Column(name = "ID_USER")
	private Long id;
	
	@NotNull
	@Column(name = "USER_NAME", unique = true)
	String username;
	
	@NotNull
	@Column(name = "PASSWORD_USER")
	String password;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
