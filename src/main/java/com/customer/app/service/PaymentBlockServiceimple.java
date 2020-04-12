package com.customer.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.customer.app.dao.CountryDAO;
import com.customer.app.dao.CustomerDAO;
import com.customer.app.dao.PaymentBlockDAO;
import com.customer.app.dao.PaymentMethodDAO;
import com.customer.app.dao.StateDAO;
import com.customer.app.entity.Country;
import com.customer.app.entity.PaymentBlock;
import com.customer.app.entity.PaymentMethod;
import com.customer.app.entity.State;

@Service
public class PaymentBlockServiceimple implements PaymentBlockService {
	@Autowired
	private PaymentBlockDAO paymentBlockDAO;

	@Override
	@Transactional
	public List<PaymentBlock> getPaymentBlock() {
		// TODO Auto-generated method stub
		return paymentBlockDAO.getPaymentBlock();
	}

	
}
