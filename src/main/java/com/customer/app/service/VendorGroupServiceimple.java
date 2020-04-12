package com.customer.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.customer.app.dao.CountryDAO;
import com.customer.app.dao.CustomerDAO;
import com.customer.app.dao.VendorGroupDAO;
import com.customer.app.entity.Country;
import com.customer.app.entity.VenderGroup;

@Service
public class VendorGroupServiceimple implements VendorGroupService {
	@Autowired
	private VendorGroupDAO vendorGroupDAO ;

	@Override
	@Transactional
	public List<VenderGroup> getVendorGroup() {
		// TODO Auto-generated method stub
		return vendorGroupDAO.getVendorGroup();
	}

	@Override
	@Transactional
	public List<VenderGroup> getGLCode(String venderGroup) {
		// TODO Auto-generated method stub
		return vendorGroupDAO.getGLCode(venderGroup);
	}

	


}
