package com.customer.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="\"Payment_Term\"")
public class PaymentTerm {

	@Id
	@Column(name="\"PaymentTerm\"")
	private String paymentterm;
	
	@Column(name="\"Description\"")
	private String description;

	public PaymentTerm() {
		
	}

	public String getPaymentterm() {
		return paymentterm;
	}

	public void setPaymentterm(String paymentterm) {
		this.paymentterm = paymentterm;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "PaymentTerm [paymentterm=" + paymentterm + ", description=" + description + "]";
	}


		
}





