package com.customer.app.dao;

import java.util.List;

import com.customer.app.entity.Country;
import com.customer.app.entity.PaymentMethod;
import com.customer.app.entity.State;


public interface PaymentMethodDAO {

	public List<PaymentMethod> getPaymentMethod(String vendertype);

}
