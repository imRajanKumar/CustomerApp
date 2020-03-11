package com.customer.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="\"Country_State_Code_Master\"")
public class State {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="\"State\"")
	private String stateid;
	
	@Column(name="\"Countryid\"")
	private String countryid;
	
	
	@Column(name="\"Description\"")
	private String stateName;
	
	


	public State() {
		
	}




	public String getStateid() {
		return stateid;
	}




	public void setStateid(String stateid) {
		this.stateid = stateid;
	}




	public String getCountryid() {
		return countryid;
	}




	public void setCountryid(String countryid) {
		this.countryid = countryid;
	}




	public String getStateName() {
		return stateName;
	}




	public void setStateName(String stateName) {
		this.stateName = stateName;
	}




	@Override
	public String toString() {
		return "State [stateid=" + stateid + ", countryid=" + countryid + ", stateName=" + stateName + "]";
	}

	

	
		
}





