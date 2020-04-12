package com.customer.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="\"Payment_Method_Master\"")
public class PaymentMethod {

	
	@Column(name="\"Vendor_Type\"")
	private String vendortype;
	
	@Id
	@Column(name="\"Payment_Method\"")
	private String paymentmethod;

	public PaymentMethod() {
		
	}

	public String getVendortype() {
		return vendortype;
	}

	public void setVendortype(String vendortype) {
		this.vendortype = vendortype;
	}

	public String getPaymentmethod() {
		return paymentmethod;
	}

	public void setPaymentmethod(String paymentmethod) {
		this.paymentmethod = paymentmethod;
	}

	@Override
	public String toString() {
		return "PaymentMethod [paymentmethod=" + paymentmethod + "]";
	}

	
		
	
	
}





