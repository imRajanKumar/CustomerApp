package com.customer.app.service;

import java.util.List;

import com.customer.app.entity.Country;
import com.customer.app.entity.State;
import com.customer.app.entity.VendorClass;


public interface VendorClassService {

	public List<VendorClass> getVendorClass(String vendortype);

}
