package com.customer.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.customer.app.dao.CountryDAO;
import com.customer.app.dao.CustomerDAO;
import com.customer.app.dao.PaymentMethodDAO;
import com.customer.app.dao.StateDAO;
import com.customer.app.entity.Country;
import com.customer.app.entity.PaymentMethod;
import com.customer.app.entity.State;

@Service
public class PaymentMethodServiceimple implements PaymentMethodService {
	@Autowired
	private PaymentMethodDAO paymentMethodDAO;

	@Override
	@Transactional
	public List<PaymentMethod> getPaymentMethod(String vendertype) {
		// TODO Auto-generated method stub
		return paymentMethodDAO.getPaymentMethod(vendertype);
	}

	
}
