package com.profbruno.familywatch.model;

import javax.persistence.*;

@Entity
public class Coordinate {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private double latitude;
	
	private double longitude;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	
	

}
