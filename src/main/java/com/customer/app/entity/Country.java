package com.customer.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="\"Country_Master\"")
public class Country {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="\"Country\"")
	private String id;
	
	@Column(name="\"Description\"")
	private String countryName;

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public Country() {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Country [id=" + id + ", countryName=" + countryName + "]";
	}


	
		
}





