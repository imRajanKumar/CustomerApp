package com.customer.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="\"Bank_Detail_Master\"")
public class BankKey {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="\"Bank_Key\"")
	private String bankkey;
	
	@Column(name="\"Bank_Country\"")
	private String countryid;
	
	
	@Column(name="\"Name_of_bank\"")
	private String bankname;
	
	
	public BankKey() {
		
	}


	public String getBankkey() {
		return bankkey;
	}


	public void setBankkey(String bankkey) {
		this.bankkey = bankkey;
	}


	public String getCountryid() {
		return countryid;
	}


	public void setCountryid(String countryid) {
		this.countryid = countryid;
	}


	public String getBankname() {
		return bankname;
	}


	public void setBankname(String bankname) {
		this.bankname = bankname;
	}


	@Override
	public String toString() {
		return "BankKey [bankkey=" + bankkey + ", countryid=" + countryid + ", bankname=" + bankname + "]";
	}




	
		
}





