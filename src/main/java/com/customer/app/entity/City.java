package com.customer.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="\"City\"")
public class City {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="\"Cityid\"")
	private String cityid;
	
	@Column(name="\"Stateid\"")
	private String stateid;
	
	
	@Column(name="\"CityName\"")
	private String cityName;
	
	


	public City() {
		
	}




	public String getCityid() {
		return cityid;
	}




	public void setCityid(String cityid) {
		this.cityid = cityid;
	}




	public String getStateid() {
		return stateid;
	}




	public void setStateid(String stateid) {
		this.stateid = stateid;
	}




	public String getCityName() {
		return cityName;
	}




	public void setCityName(String cityName) {
		this.cityName = cityName;
	}




	@Override
	public String toString() {
		return "City [cityid=" + cityid + ", stateid=" + stateid + ", cityName=" + cityName + "]";
	}





		
}





