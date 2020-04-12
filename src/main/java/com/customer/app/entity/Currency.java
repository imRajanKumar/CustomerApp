package com.customer.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="\"Currency_Master\"")
public class Currency {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="\"Currency\"")
	private String id;
	
	@Column(name="\"Description\"")
	private String currency;

	public Currency() {
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	@Override
	public String toString() {
		return "Currency [id=" + id + ", currency=" + currency + "]";
	}	
		
}





