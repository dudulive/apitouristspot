package com.example.apitouristspot.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_FAVORITE_TOURIST_SPOT")
public class FavoriteTouristSpot implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
	@SequenceGenerator(name = "TB_FAVORITE_TOURIST_SPOT_ID_FAVORITE_TOURIST_SPOT_SEQ",
     sequenceName = "TB_FAVORITE_TOURIST_SPOT_ID_FAVORITE_TOURIST_SPOT_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TB_FAVORITE_TOURIST_SPOT_ID_FAVORITE_TOURIST_SPOT_SEQ")
	@Column(name = "ID_FAVORITE_TOURIST_SPOT", updatable = false)
	private Long id;

    @ManyToOne
    @JoinColumn(name = "ID_TOURIST_SPOT")
	private TouristSpot touristSpot;

    @ManyToOne
    @JoinColumn(name = "ID_USER")
    private User user;


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TouristSpot getTouristSpot() {
        return this.touristSpot;
    }

    public void setTouristSpot(TouristSpot touristSpot) {
        this.touristSpot = touristSpot;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
}
