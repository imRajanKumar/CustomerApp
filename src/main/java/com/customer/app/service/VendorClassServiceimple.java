package com.customer.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.customer.app.dao.CountryDAO;
import com.customer.app.dao.CustomerDAO;
import com.customer.app.dao.StateDAO;
import com.customer.app.dao.VendorClassDAO;
import com.customer.app.entity.Country;
import com.customer.app.entity.State;
import com.customer.app.entity.VendorClass;

@Service
public class VendorClassServiceimple implements VendorClassService {
	@Autowired
	private VendorClassDAO vendorClassDAO;

	@Override
	@Transactional
	public List<VendorClass> getVendorClass(String vendortype) {
		// TODO Auto-generated method stub
		return vendorClassDAO.getVendorClass(vendortype);
	}

}
