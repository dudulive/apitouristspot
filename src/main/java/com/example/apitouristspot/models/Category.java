package com.example.apitouristspot.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name= "TB_CATEGORY")
public class Category implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID_CATEGORY")
	private Long id;
	
	@NotNull
	@Column(name = "NAME_CATEGORY")
	private String name;
	
	@OneToMany(mappedBy = "category", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<TouristSpot> touristSpots = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<TouristSpot> getTouristSpots() {
		return touristSpots;
	}

	public void setTouristSpots(List<TouristSpot> touristSpots) {
		this.touristSpots = touristSpots;
	}
	
	

}
