package com.customer.app.dao;

import java.util.List;

import com.customer.app.entity.BankKey;


public interface BankKeyDAO {

	public List<BankKey> getBankKey(String id);
	public List<BankKey> getBankName(String bankKey);

}
