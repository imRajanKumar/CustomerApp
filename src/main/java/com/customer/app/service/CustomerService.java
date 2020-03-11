package com.customer.app.service;

import java.util.List;
import java.util.Map;

import com.customer.app.entity.Country;
import com.customer.app.entity.Customer;

public interface CustomerService {

	public List<Customer> getCustomers();
	

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

	public void deleteCustomer(int theId);
	
	public List<Customer> searchCustomers(String theSearchName);
	
}
