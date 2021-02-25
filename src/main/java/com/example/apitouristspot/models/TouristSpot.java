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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name= "TB_TOURIST_SPOT")
public class TouristSpot implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "TB_TOURIST_SPOT_SEQ", sequenceName = "TB_TOURIST_SPOT_ID_TOURIST_SPOT_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TB_TOURIST_SPOT_ID_TOURIST_SPOT_SEQ")
	@Column(name = "ID_TOURIST_SPOT")
	private Long id;
	
	@NotNull
	@Column(name = "NAME_TOURIST_SPOT")
	private String name;

	@NotNull
	@Column(name = "NAME_LATITUDE")
	private Long latitude;
	
	@NotNull
	@Column(name = "NAME_LONGITUDE")
	private Long longitude;
	
	@ManyToOne
    @JoinColumn(name = "ID_CATEGORY")
	private Category category;
	
	@OneToMany(mappedBy = "touristSpot", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Picture> pictures = new ArrayList<>();

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

	public Long getLatitude() {
		return latitude;
	}

	public void setLatitude(Long latitude) {
		this.latitude = latitude;
	}

	public Long getLongitude() {
		return longitude;
	}

	public void setLongitude(Long longitude) {
		this.longitude = longitude;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public List<Picture> getPictures() {
		return pictures;
	}

	public void setPictures(List<Picture> pictures) {
		this.pictures = pictures;
	}
	
}
