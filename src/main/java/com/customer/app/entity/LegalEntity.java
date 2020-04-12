package com.customer.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="\"LegalEntity\"")
public class LegalEntity {

	@Id
	@Column(name="\"Legal_Entity\"")
	private String legalentity;
	
	
	
	@Column(name="\"Description\"")
	private String description;
	


	public LegalEntity() {
		
	}



	public String getLegalentity() {
		return legalentity;
	}



	public void setLegalentity(String legalentity) {
		this.legalentity = legalentity;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	@Override
	public String toString() {
		return "LegalEntity [legalentity=" + legalentity + ", description=" + description + "]";
	}




	



	
		
}





