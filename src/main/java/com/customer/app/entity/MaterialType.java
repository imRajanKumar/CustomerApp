package com.customer.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="\"Material_Master\"")
public class MaterialType {

	@Id
	@Column(name="\"MaterialType\"")
	private String materialtype;
	
	@Column(name="\"Description\"")
	private String description;

	public MaterialType() {
		
	}

	public String getMaterialtype() {
		return materialtype;
	}

	public void setMaterialtype(String materialtype) {
		this.materialtype = materialtype;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "MaterialType [materialtype=" + materialtype + ", description=" + description + "]";
	}

	



	


	
		
}





