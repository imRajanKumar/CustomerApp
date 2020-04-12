package com.customer.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="\"Gst_Vendor_Class_Master\"")
public class VendorClass {

	@Id
	@Column(name="\"GST_Vendor_Class\"")
	private String gstvendorclass;
	
	@Column(name="\"VendorType\"")
	private String vendortype;
	
	@Column(name="\"Description\"")
	private String description;
	
	public VendorClass() {
		
	}

	public String getGstvendorclass() {
		return gstvendorclass;
	}

	public void setGstvendorclass(String gstvendorclass) {
		this.gstvendorclass = gstvendorclass;
	}

	public String getVendortype() {
		return vendortype;
	}

	public void setVendortype(String vendortype) {
		this.vendortype = vendortype;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "VendorClass [gstvendorclass=" + gstvendorclass + ", vendortype=" + vendortype + ", description="
				+ description + "]";
	}
	
}





