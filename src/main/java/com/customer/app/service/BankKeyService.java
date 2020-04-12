package com.customer.app.service;

import java.util.List;

import com.customer.app.entity.BankKey;


public interface BankKeyService {

	public List<BankKey> getBankKey(String id);
	public List<BankKey> getBankName(String bankKey);


}
