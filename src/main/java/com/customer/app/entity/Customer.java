package com.customer.app.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name="customer")
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	
	
	@Column(name="country")
	private String country;
	
	@Column(name="state")
	private String state;
	
	@Column(name="city")
	private String city;
	
	@Column(name="country_desc")
	private String countrydesc;
	
	
	   @ElementCollection(fetch = FetchType.EAGER)
	   @CollectionTable(name="countrylists", joinColumns=@JoinColumn(name="id"))
	   @Column(name="country")
	   private List<String> countrylist;
	

	   

	@ElementCollection
	@LazyCollection(LazyCollectionOption.FALSE)
	   @CollectionTable(name="paymentlists", joinColumns=@JoinColumn(name="id"))
	   @Column(name="payment")
	private List<String> paymentlist;
	
	
	@Column(name="status")
	private String status;
	@Column(name="createdate")
	private LocalDateTime createdate;

	
	
	public LocalDateTime getCreatedate() {
		return createdate;
	}

	public void setCreatedate(LocalDateTime createdate) {
		this.createdate = createdate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<String> getPaymentlist() {
		return paymentlist;
	}

	public void setPaymentlist(List<String> paymentlist) {
		this.paymentlist = paymentlist;
	}

	public List<String> getCountrylist() {
		return countrylist;
	}

	public void setCountrylist(List<String> countrylist) {
		this.countrylist = countrylist;
	}

	public String getCountrydesc() {
		return countrydesc;
	}

	public void setCountrydesc(String countrydesc) {
		this.countrydesc = countrydesc;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	

	public Customer() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", country=" + country
				+ ", state=" + state + ", city=" + city + ", countrydesc=" + countrydesc + ", countrylist="
				+ countrylist + ", paymentlist=" + paymentlist + "]";
	}

	
	
	
	

	

	
	
		
}





