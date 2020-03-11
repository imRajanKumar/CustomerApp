package com.customer.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.customer.app.dao.CountryDAO;
import com.customer.app.dao.CustomerDAO;
import com.customer.app.entity.Country;

@Service
public class CountryServiceimple implements CountryService {
	@Autowired
	private CountryDAO countryDAO;

	@Override
	@Transactional
	public List<Country> getCountry() {
		// TODO Auto-generated method stub
		return countryDAO.getCountry();
	}

}
