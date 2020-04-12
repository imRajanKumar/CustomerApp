package com.customer.app.service;

import java.util.List;

import com.customer.app.entity.ActualQmSys;
import com.customer.app.entity.VenderGroup;


public interface VendorGroupService {

	public List<VenderGroup> getVendorGroup();
	public List<VenderGroup> getGLCode(String venderGroup);

	

}
