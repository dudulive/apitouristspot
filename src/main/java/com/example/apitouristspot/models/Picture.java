package com.example.apitouristspot.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name= "TB_PICTURE")
public class Picture implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID_CATEGORY")
	private Long id;
	
	@NotNull
	@Column(name = "VALUE_CATEGORY")
	private String value;
	
	@ManyToOne
    @JoinColumn(name = "ID_TOURIST_SPOT")
	private TouristSpot touristSpot;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public TouristSpot getTouristSpot() {
		return touristSpot;
	}

	public void setTouristSpot(TouristSpot touristSpot) {
		this.touristSpot = touristSpot;
	}

	
}
