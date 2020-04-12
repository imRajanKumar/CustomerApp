package com.customer.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="\"Incoterm_Master\"")
public class Incoterm {

	@Id
	@Column(name="\"Incoterm\"")
	private String incoterm;
	
	@Column(name="\"Description\"")
	private String description;

	public Incoterm() {
		
	}

	public String getIncoterm() {
		return incoterm;
	}

	public void setIncoterm(String incoterm) {
		this.incoterm = incoterm;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Incoterm [incoterm=" + incoterm + ", description=" + description + "]";
	}

	
	



	


	
		
}





