package com.customer.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="\"GSTFileing\"")
public class GSTFiling {

	@Id
	@Column(name="\"GST_Fileing\"")
	private String gstfileing;
	
	@Column(name="\"Description\"")
	private String description;

	public GSTFiling() {
		
	}

	public String getGstfileing() {
		return gstfileing;
	}

	public void setGstfileing(String gstfileing) {
		this.gstfileing = gstfileing;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "GSTFiling [gstfileing=" + gstfileing + ", description=" + description + "]";
	}

	



	


	
		
}





