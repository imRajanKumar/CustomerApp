package com.customer.app.dao;

import java.util.List;

import com.customer.app.entity.Country;


public interface CountryDAO {

	public List<Country> getCountry();
	public List<Country> getCountry(String id);

}
