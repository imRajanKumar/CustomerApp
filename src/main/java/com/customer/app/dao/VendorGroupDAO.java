package com.customer.app.dao;

import java.util.List;

import com.customer.app.entity.ActualQmSys;
import com.customer.app.entity.VenderGroup;


public interface VendorGroupDAO {

	public List<VenderGroup> getVendorGroup();
	public List<VenderGroup> getGLCode(String venderGroup);
	

}
