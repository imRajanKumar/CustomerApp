package com.customer.app.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;


@Entity
@Table(name="\"STG_SCR_Vendor\"")
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="\"MDM_Vendor_Code\"")
	private int id;
	
	@Column(name="\"SAP_Vendor_Code\"")
	private String sapVendorCode;
	
	@Column(name="\"Vendor_Group_Code\"")
	private String venderGroup;
	
	@Column(name="\"Title_Code\"")
	private String title;


	@Column(name="\"First_Name\"")
	private String firstName;
	
	@Column(name="\"Last_Name\"")
	private String lastName;
	
	@Column(name="\"Name2\"")
	private String name2;
	
	@Column(name="\"Legal_Name\"")
	private String legalName;
	
	@Column(name="\"Country_Code\"")
	private String country;
	
	@Column(name="\"State_Code\"")
	private String state;
	
	@Column(name="\"House_No\"")
	private String house;
	
	@Column(name="\"Street\"")
	private String street;
	
	@Column(name="\"Street1\"")
	private String street1;
	
	@Column(name="\"Street2\"")
	private String street2;
	
	@Column(name="\"Pin_Code\"")
	private String pincode;
	
	@Column(name="\"City\"")
	private String city;
	
	@Column(name="\"Fax_Number\"")
	private String faxNumber;
	
	@Column(name="\"Mobile_No\"")
	private String mobile;

	@Column(name="\"Telephone_No\"")
	private String telephone;
	
	@Column(name="\"EMail_Id\"")
	private String emailId;
		
	@Column(name="\"GST_Fileing_Code\"")
	private String gstFileingCode;
	
	@Column(name="\"Material_Type_Code\"")
	private String materialaTypeCode;
	
	@Column(name="\"Sales_Person\"")
	private String salesPerson;
	
	@Column(name="\"Sales_Person_Tele_No\"")
	private String salesPersonTeleNo;
		
	@Column(name="\"Bank_Key\"")
	private String bankKey;
	
	@Column(name="\"Bank_Name\"")
	private String bankName;
	
	@Column(name="\"Bank_Account_No\"")
	private String bankaccountno;
	
	@Column(name="\"Incoterm_Code\"")
	private String incoterm;
	
	
	@Column(name="\"Currency_Code\"")
	private String currency;
	
	
	@Column(name="\"Payment_Term_Code\"")
	private String paymentterm;
	
	@Column(name="\"VendorClass_Code\"")
	private String VendorClass;
	
	@Column(name="\"GST_No\"")
	private String gstno;
	
	@Column(name="\"PAN_No\"")
	private String panno;
	
	@Column(name="\"Adhaar_No\"")
	private String adhaarNo;
	
	@Column(name="\"GL_Code\"")
	private String glCode;
	
	@Column(name="\"Legal_Entity_Code\"")
	private String legalEntityCode;
	
	@Column(name="\"ID_Type_Code\"")
	private String idTypeCode;
		
	@Column(name="\"Identification_Number\"")
	private String identificationNumber;
	
	@Column(name="\"Payment_Block_Code\"")
	private String paymentBlockCode;
	
	@Column(name="\"Inco_Location1\"")
	private String incoLocation1;
	
	@Column(name="\"Status\"")
	private String status;
	
	@Column(name="\"Created_By\"")
	private LocalDateTime createdby;
	
	@Column(name="\"Created_Date\"")
	private LocalDateTime createdate;
	
	
    @ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(name="\"STG_SCR_PaymentMethods\"", joinColumns=@JoinColumn(name="\"MDM_Vendor_Code\""))
	@Column(name="\"PaymentMethods\"")
	private List<String> paymentethods;

	@ElementCollection
	@LazyCollection(LazyCollectionOption.FALSE)
	@CollectionTable(name="\"STG_SCR_Actual_Qm_Sys\"", joinColumns=@JoinColumn(name="\"MDM_Vendor_Code\""))
	@Column(name="\"Actual_Qm_Sys\"")
	private List<String> actualQmSys;

	
	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSapVendorCode() {
		return sapVendorCode;
	}

	public void setSapVendorCode(String sapVendorCode) {
		this.sapVendorCode = sapVendorCode;
	}

	public String getVenderGroup() {
		return venderGroup;
	}

	public void setVenderGroup(String venderGroup) {
		this.venderGroup = venderGroup;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getName2() {
		return name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}

	public String getLegalName() {
		return legalName;
	}

	public void setLegalName(String legalName) {
		this.legalName = legalName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getHouse() {
		return house;
	}

	public void setHouse(String house) {
		this.house = house;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getStreet1() {
		return street1;
	}

	public void setStreet1(String street1) {
		this.street1 = street1;
	}

	public String getStreet2() {
		return street2;
	}

	public void setStreet2(String street2) {
		this.street2 = street2;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getFaxNumber() {
		return faxNumber;
	}

	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getGstFileingCode() {
		return gstFileingCode;
	}

	public void setGstFileingCode(String gstFileingCode) {
		this.gstFileingCode = gstFileingCode;
	}

	public String getMaterialaTypeCode() {
		return materialaTypeCode;
	}

	public void setMaterialaTypeCode(String materialaTypeCode) {
		this.materialaTypeCode = materialaTypeCode;
	}

	public String getSalesPerson() {
		return salesPerson;
	}

	public void setSalesPerson(String salesPerson) {
		this.salesPerson = salesPerson;
	}

	public String getSalesPersonTeleNo() {
		return salesPersonTeleNo;
	}

	public void setSalesPersonTeleNo(String salesPersonTeleNo) {
		this.salesPersonTeleNo = salesPersonTeleNo;
	}

	public String getBankKey() {
		return bankKey;
	}

	public void setBankKey(String bankKey) {
		this.bankKey = bankKey;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankaccountno() {
		return bankaccountno;
	}

	public void setBankaccountno(String bankaccountno) {
		this.bankaccountno = bankaccountno;
	}

	public String getIncoterm() {
		return incoterm;
	}

	public void setIncoterm(String incoterm) {
		this.incoterm = incoterm;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getPaymentterm() {
		return paymentterm;
	}

	public void setPaymentterm(String paymentterm) {
		this.paymentterm = paymentterm;
	}

	public String getVendorClass() {
		return VendorClass;
	}

	public void setVendorClass(String vendorClass) {
		VendorClass = vendorClass;
	}

	public String getGstno() {
		return gstno;
	}

	public void setGstno(String gstno) {
		this.gstno = gstno;
	}

	public String getPanno() {
		return panno;
	}

	public void setPanno(String panno) {
		this.panno = panno;
	}

	public String getAdhaarNo() {
		return adhaarNo;
	}

	public void setAdhaarNo(String adhaarNo) {
		this.adhaarNo = adhaarNo;
	}

	public String getGlCode() {
		return glCode;
	}

	public void setGlCode(String glCode) {
		this.glCode = glCode;
	}

	public String getLegalEntityCode() {
		return legalEntityCode;
	}

	public void setLegalEntityCode(String legalEntityCode) {
		this.legalEntityCode = legalEntityCode;
	}

	public String getIdTypeCode() {
		return idTypeCode;
	}

	public void setIdTypeCode(String idTypeCode) {
		this.idTypeCode = idTypeCode;
	}

	public String getIdentificationNumber() {
		return identificationNumber;
	}

	public void setIdentificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
	}

	public String getPaymentBlockCode() {
		return paymentBlockCode;
	}

	public void setPaymentBlockCode(String paymentBlockCode) {
		this.paymentBlockCode = paymentBlockCode;
	}

	public String getIncoLocation1() {
		return incoLocation1;
	}

	public void setIncoLocation1(String incoLocation1) {
		this.incoLocation1 = incoLocation1;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDateTime getCreatedby() {
		return createdby;
	}

	public void setCreatedby(LocalDateTime createdby) {
		this.createdby = createdby;
	}

	public LocalDateTime getCreatedate() {
		return createdate;
	}

	public void setCreatedate(LocalDateTime createdate) {
		this.createdate = createdate;
	}

	public List<String> getPaymentethods() {
		return paymentethods;
	}

	public void setPaymentethods(List<String> paymentethods) {
		this.paymentethods = paymentethods;
	}

	public List<String> getActualQmSys() {
		return actualQmSys;
	}

	public void setActualQmSys(List<String> actualQmSys) {
		this.actualQmSys = actualQmSys;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", sapVendorCode=" + sapVendorCode + ", venderGroup=" + venderGroup
				+ ", firstName=" + firstName + ", lastName=" + lastName + ", name2=" + name2 + ", legalName="
				+ legalName + ", country=" + country + ", state=" + state + ", house=" + house + ", street=" + street
				+ ", street1=" + street1 + ", street2=" + street2 + ", pincode=" + pincode + ", city=" + city
				+ ", faxNumber=" + faxNumber + ", mobile=" + mobile + ", telephone=" + telephone + ", emailId="
				+ emailId + ", gstFileingCode=" + gstFileingCode + ", materialaTypeCode=" + materialaTypeCode
				+ ", salesPerson=" + salesPerson + ", salesPersonTeleNo=" + salesPersonTeleNo + ", bankKey=" + bankKey
				+ ", bankName=" + bankName + ", bankaccountno=" + bankaccountno + ", incoterm=" + incoterm
				+ ", currency=" + currency + ", paymentterm=" + paymentterm + ", VendorClass=" + VendorClass
				+ ", gstno=" + gstno + ", panno=" + panno + ", adhaarNo=" + adhaarNo + ", glCode=" + glCode
				+ ", legalEntityCode=" + legalEntityCode + ", idTypeCode=" + idTypeCode + ", identificationNumber="
				+ identificationNumber + ", paymentBlockCode=" + paymentBlockCode + ", incoLocation1=" + incoLocation1
				+ ", status=" + status + ", createdby=" + createdby + ", createdate=" + createdate + ", paymentethods="
				+ paymentethods + ", actualQmSys=" + actualQmSys + "]";
	}

	
}





