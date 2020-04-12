package com.customer.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="\"Actual_QM_sys\"")
public class ActualQmSys {

	@Id
	@Column(name="\"actual_QM_sys\"")
	private String actualqmsyss;
	
	
	
	@Column(name="\"Description\"")
	private String description;
	


	public ActualQmSys() {
		
	}



	public String getActualqmsyss() {
		return actualqmsyss;
	}



	public void setActualqmsyss(String actualqmsyss) {
		this.actualqmsyss = actualqmsyss;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	@Override
	public String toString() {
		return "ActualQmSys [actualqmsyss=" + actualqmsyss + ", description=" + description + "]";
	}



	



	




	



	
		
}





