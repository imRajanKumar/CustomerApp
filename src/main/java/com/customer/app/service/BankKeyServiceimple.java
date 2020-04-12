package com.customer.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.customer.app.dao.BankKeyDAO;
import com.customer.app.dao.CountryDAO;
import com.customer.app.dao.CustomerDAO;
import com.customer.app.dao.TitleDAO;
import com.customer.app.dao.VendorGroupDAO;
import com.customer.app.entity.BankKey;
import com.customer.app.entity.Country;
import com.customer.app.entity.Title;
import com.customer.app.entity.VenderGroup;

@Service
public class BankKeyServiceimple implements BankKeyService {
	@Autowired
	private BankKeyDAO bankKeyDAO ;

	@Override
	@Transactional
	public List<BankKey> getBankKey(String id) {
		// TODO Auto-generated method stub
		return bankKeyDAO.getBankKey(id);
	}

	@Override
	@Transactional
	public List<BankKey> getBankName(String bankKey) {
		// TODO Auto-generated method stub
		return bankKeyDAO.getBankName(bankKey);
	}

	


}
