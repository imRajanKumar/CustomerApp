package com.customer.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.customer.app.dao.CountryDAO;
import com.customer.app.dao.CustomerDAO;
import com.customer.app.dao.IDTypeDAO;
import com.customer.app.dao.IncotermDAO;
import com.customer.app.dao.TitleDAO;
import com.customer.app.dao.VendorGroupDAO;
import com.customer.app.entity.Country;
import com.customer.app.entity.IDType;
import com.customer.app.entity.Incoterm;
import com.customer.app.entity.Title;
import com.customer.app.entity.VenderGroup;

@Service
public class IDTypeServiceimple implements IDTypeService  {
	@Autowired
	private IDTypeDAO iDTypeDAO ;

	@Override
	@Transactional
	public List<IDType> getIDType() {
		// TODO Auto-generated method stub
		return iDTypeDAO.getIDType();
	}

	


}
