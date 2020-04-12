package com.customer.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.customer.app.dao.CountryDAO;
import com.customer.app.dao.CurrencyDAO;
import com.customer.app.dao.CustomerDAO;
import com.customer.app.dao.TitleDAO;
import com.customer.app.dao.VendorGroupDAO;
import com.customer.app.entity.Country;
import com.customer.app.entity.Currency;
import com.customer.app.entity.Title;
import com.customer.app.entity.VenderGroup;

@Service
public class CurrencyServiceimple implements CurrencyService {
	@Autowired
	private CurrencyDAO currencyDAO ;

	@Override
	@Transactional
	public List<Currency> getCurrency() {
		// TODO Auto-generated method stub
		return currencyDAO.getCurrency();
	}

	


}
