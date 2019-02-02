package com.ingecno.dmart.masterData;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class City {
	
	@Id
	private String cityName;
	
	@ManyToOne
	private Country country;
	
	@ManyToOne 
	private State state;

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "City [cityName=" + cityName + ", country=" + country + ", state=" + state + "]";
	}
}
