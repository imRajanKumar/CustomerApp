package com.customer.app.dao;

import java.util.List;

import com.customer.app.entity.Country;
import com.customer.app.entity.State;
import com.customer.app.entity.VendorClass;


public interface VendorClassDAO {

	public List<VendorClass> getVendorClass(String vendortype);

}
