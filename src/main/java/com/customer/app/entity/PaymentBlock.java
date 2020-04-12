package com.customer.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="\"Payment_Block\"")
public class PaymentBlock {

	@Id
	@Column(name="\"Payment_block\"")
	private String paymentblock;
	
	
	
	@Column(name="\"Description\"")
	private String description;
	


	public PaymentBlock() {
		
	}



	public String getPaymentblock() {
		return paymentblock;
	}



	public void setPaymentblock(String paymentblock) {
		this.paymentblock = paymentblock;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	@Override
	public String toString() {
		return "PaymentBlock [paymentblock=" + paymentblock + ", description=" + description + "]";
	}




	


		
}





