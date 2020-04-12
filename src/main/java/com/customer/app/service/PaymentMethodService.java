package com.customer.app.service;

import java.util.List;

import com.customer.app.entity.Country;
import com.customer.app.entity.PaymentMethod;
import com.customer.app.entity.State;


public interface PaymentMethodService {
	public List<PaymentMethod> getPaymentMethod(String vendertype);


}
