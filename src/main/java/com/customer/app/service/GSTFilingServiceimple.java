package com.customer.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.customer.app.dao.CountryDAO;
import com.customer.app.dao.CustomerDAO;
import com.customer.app.dao.GSTFilingDAO;
import com.customer.app.dao.TitleDAO;
import com.customer.app.dao.VendorGroupDAO;
import com.customer.app.entity.Country;
import com.customer.app.entity.GSTFiling;
import com.customer.app.entity.Title;
import com.customer.app.entity.VenderGroup;

@Service
public class GSTFilingServiceimple implements GSTFilingService {
	@Autowired
	private GSTFilingDAO gSTFilingDAO ;

	@Override
	@Transactional
	public List<GSTFiling> getGSTFiling() {
		// TODO Auto-generated method stub
		return gSTFilingDAO.getGSTFiling();
	}

	


}
