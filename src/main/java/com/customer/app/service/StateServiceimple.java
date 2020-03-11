package com.customer.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.customer.app.dao.CountryDAO;
import com.customer.app.dao.CustomerDAO;
import com.customer.app.dao.StateDAO;
import com.customer.app.entity.Country;
import com.customer.app.entity.State;

@Service
public class StateServiceimple implements StateService {
	@Autowired
	private StateDAO stateDAO;

	@Override
	@Transactional
	
	public List<State> getState(String id) {
		// TODO Auto-generated method stub
		return stateDAO.getState(id);
	}

	
}
