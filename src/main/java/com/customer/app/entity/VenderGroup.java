package com.customer.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="\"Vendor_Group_Master\"")
public class VenderGroup {

	@Id
	@Column(name="\"Vendor_Group\"")
	private String vendor_group;
	
	@Column(name="\"Description\"")
	private String description;
	
	@Column(name="\"G_L_Code\"")
	private Integer glcode;

	public VenderGroup() {
		
	}

	public Integer getGlcode() {
		return glcode;
	}

	public void setGlcode(Integer glcode) {
		this.glcode = glcode;
	}

	public String getVendor_group() {
		return vendor_group;
	}



	public void setVendor_group(String vendor_group) {
		this.vendor_group = vendor_group;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "VenderGroup [vendor_group=" + vendor_group + ", description=" + description + ", glcode=" + glcode
				+ "]";
	}



		
}





