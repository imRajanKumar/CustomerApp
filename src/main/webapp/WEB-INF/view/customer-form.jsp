<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

<head>
	<title>Customer</title>
	<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
 
</head>

	<%-- <link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css">
		  

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/add-customer-style.css"> --%>
</head>
<script type="text/javascript">
$(document).ready(function(){
	
	
	var bankkey = $('#comboboxBankKey').val();
	
	 $.ajax({
		type: 'GET',
		url: '${pageContext.request.contextPath }/customer/loadDescByBankKey/' + bankkey,
		success: function(result) {
			
			
			var result = JSON.parse(result);
			var s = '';
			for(var i = 0; i < result.length; i++) {
				s += '<option value="' + result[i].bankname+ '">' + result[i].bankname + '</option>';
			}
			
			$('#comboboxBankName').html(s);
		}
	});  

	 var vendergroup = $('#venderGroup').val();
	 $.ajax({
		type: 'GET',
		url: '${pageContext.request.contextPath }/customer/loadGLCodeByVenderGroup/' + vendergroup,
		success: function(result) {
			var result = JSON.parse(result);
			var s = '';
			for(var i = 0; i < result.length; i++) {
				s += '<option value="' + result[i].glcode+ '">' + result[i].glcode + '</option>';
			}
			$('#glcode').html(s);
		}
	});  
	 
	 
	 
	/*  $.ajax({
			type: 'GET',
			url: '${pageContext.request.contextPath }/customer/loadVendorClassByVendorType/' + vendortype,
			success: function(result) {
				var result = JSON.parse(result);
				var s='<option value=""><strong>Select</strong></option>';
				for(var i = 0; i < result.length; i++) {
					s += '<option value="' + result[i].gstvendorclass+ '">' + result[i].description + '</option>';
				}
				$('#vendorclass').html(s);
			}
		});   */
	 
	 
	/* var s=$('#comboboxState').val();
	
	if(s=="UP")
		{
		$('#comboboxState').html("<option value='UP' >UTTERPRADESH</option>");
		$('#comboboxState').attr('readonly', true);

		
		} */
	
	
	  $('#countryid').on('change', function(){
		var countryId = $(this).val();
		/*  $.ajax({
				type: 'GET',
				url: '${pageContext.request.contextPath }/customer/loadDescByCountry/' + countryId,
				success: function(result) {
					var result = JSON.parse(result);
					 var s='';
					for(var i = 0; i < result.length; i++) {
						s += '<option value="' + result[i].id + '">' + result[i].countryName + '</option>';
					} 
					
					$('#coun').html(s);
				}
				
			});   */
		
		/*  $.ajax({
				type: 'GET',
				url: '${pageContext.request.contextPath }/customer/loadPaymentMethodsByCountry/' + countryId,
				success: function(result) {
					var result = JSON.parse(result);
					var s='<option value=""><strong>Select</strong></option>';
					for(var i = 0; i < result.length; i++) {
						s += '<option value="' + result[i].paymentid + '">' + result[i].paymentName + '</option>';
					}
					$('#paymentid').html(s);
				}
				
			 
			});    */
		 
		 
		 
		 $('#dropDownId').val();
		
		if(countryId=="IND")
			{
			$('#comboboxState').html("<option value='UP' >UTTERPRADESH</option>");
			$('#comboboxState').attr('readonly', true);

			/* var stateId ="UP";
			 $.ajax({
				type: 'GET',
				url: '${pageContext.request.contextPath }/customer/loadCityByState/' + stateId,
				success: function(result) {
					var result = JSON.parse(result);
					//var s = '';
					var s='<option value=""><strong>Select</strong></option>';
					for(var i = 0; i < result.length; i++) {
						s += '<option value="' + result[i].cityid+ '">' + result[i].cityName + '</option>';
					}
					
					$('#comboboxCity').html(s);
				}
			});   */
			}
		
		else
			{
			
			
			
			
		 $.ajax({
			type: 'GET',
			url: '${pageContext.request.contextPath }/customer/loadStatesByCountry/' + countryId,
			success: function(result) {
				var result = JSON.parse(result);
				var s='<option value=""><strong>Select</strong></option>';
				for(var i = 0; i < result.length; i++) {
					s += '<option value="' + result[i].stateid + '">' + result[i].stateName + '</option>';
				}
				$('#comboboxState').html(s);
			}
			
		 
		});   
		 
		 
		 
		 
		 
			}

		
		
		$.ajax({
			type: 'GET',
			url: '${pageContext.request.contextPath }/customer/loadBankKeyByCountry/' + countryId,
			success: function(result) {
				var result = JSON.parse(result);
				var s='<option value=""><strong>Select</strong></option>';
				for(var i = 0; i < result.length; i++) {
					s += '<option value="' + result[i].bankkey + '">' + result[i].bankkey + '</option>';
				}
				$('#comboboxBankKey').html(s);
			}
			
		 
		});   
		
		
		
	});  
	  
	  
	  $('#comboboxState').on('change', function(){
			var stateId = $(this).val();
			 $.ajax({
				type: 'GET',
				url: '${pageContext.request.contextPath }/customer/loadCityByState/' + stateId,
				success: function(result) {
					var result = JSON.parse(result);
					//var s = '';
					var s='<option value=""><strong>Select</strong></option>';
					for(var i = 0; i < result.length; i++) {
						s += '<option value="' + result[i].cityid+ '">' + result[i].cityName + '</option>';
					}
					
					$('#comboboxCity').html(s);
				}
			});  
		
		}); 
	  
	  $('#comboboxBankKey').on('change', function(){
			var bankkey = $(this).val();
			 $.ajax({
				type: 'GET',
				url: '${pageContext.request.contextPath }/customer/loadDescByBankKey/' + bankkey,
				success: function(result) {
					
					alert(result)
					var result = JSON.parse(result);
					var s = '';
					for(var i = 0; i < result.length; i++) {
						s += '<option value="' + result[i].bankname+ '">' + result[i].bankname + '</option>';
					}
					
					$('#comboboxBankName').html(s);
				}
			});  
		
		}); 
	  
	  
	  $('#venderGroup').on('change', function(){
			var vendergroup = $(this).val();
			 $.ajax({
				type: 'GET',
				url: '${pageContext.request.contextPath }/customer/loadGLCodeByVenderGroup/' + vendergroup,
				success: function(result) {
					var result = JSON.parse(result);
					var s = '';
					for(var i = 0; i < result.length; i++) {
						s += '<option value="' + result[i].glcode+ '">' + result[i].glcode + '</option>';
					}
					$('#glcode').html(s);
				}
			});  
		
			 var vendortype="";
			 if(vendergroup=="TV02" || vendergroup=="TV02A" || vendergroup=="TV03C" || vendergroup=="TVO3D")
				 {
				 vendortype="I"
				 }
			 else
				 {
				 vendortype="D"
				 }
			 
			 
			 $.ajax({
					type: 'GET',
					url: '${pageContext.request.contextPath }/customer/loadVendorClassByVendorType/' + vendortype,
					success: function(result) {
						var result = JSON.parse(result);
						var s='<option value=""><strong>Select</strong></option>';
						for(var i = 0; i < result.length; i++) {
							s += '<option value="' + result[i].gstvendorclass+ '">' + result[i].description + '</option>';
						}
						$('#vendorclass').html(s);
					}
				});  
			 
			 
			 $.ajax({
					type: 'GET',
					url: '${pageContext.request.contextPath }/customer/loadPaymentMethodsByVendorType/' + vendortype,
					success: function(result) {
						var result = JSON.parse(result);
						var s='<option value=""><strong>Select</strong></option>';
						for(var i = 0; i < result.length; i++) {
							s += '<option value="' + result[i].paymentmethod+ '">' + result[i].paymentmethod + '</option>';
							alert(s)
						}
						$('#paymentmethods').html(s);
					}
				});  
		}); 
	  
	  
	  
	  
});

</script>
<body>


		<form:form action="saveCustomer" modelAttribute="customer" method="POST">



<!-- need to associate this data with customer id -->
			<form:hidden path="id" />

<div class="row" style="margin-top:2%;">
		<div class="col-md-12" style="padding-left:20px;">
		<div class = "panel panel-primary">
		   <div class = "panel-heading">
		      <h3 class = "panel-title">Customer</h3>
		   </div>   
   		<div class = "panel-body">
   		<div class="row">
   		<div class="form-group col-md-6">
   				      <label class="control-label col-sm-4" for="name">MDM Vendor Code</label>
		     <%--  <div class="col-sm-8 input-group">
		       	   <form:input path="firstName" class="form-control"    id="address3"   placeholder="MDM Vendor Code" autocomplete="off"/> 
		      </div> --%>
		    </div>   
		    
		    
   		    
   		<div class="form-group col-md-6">
   		 <label class="control-label col-sm-4" for="name">SAP Vendor Code</label>
		      <div class="col-sm-8 input-group">
		       	   <form:input path="sapVendorCode" class="form-control"    id="sapVendorCode"   placeholder="SAP Vendor Code" autocomplete="off"/> 
		      </div>
		    </div>   
		    </div>
   		
   		<div class="row">
   		<div class="form-group col-md-6">
		      <label class="control-label col-sm-4" for="name">Vendor Group</label>
		      <div class="col-sm-8 input-group">
		       	   <form:select path="venderGroup" id="venderGroup"  class="form-control">
   <form:option value="NONE" label="Select"/>
         <form:options items="${vendergroup}" itemValue="vendor_group" itemLabel="description"/>
   </form:select>
		      </div>
		    </div>   
		    
   		      <div class="form-group col-md-6">
		      <label class="control-label col-sm-4" for="name">Title</label>
		      <div class="col-sm-8 input-group">
		       	   <form:select path="title" id="title" class="form-control">
             <form:option  value="NONE" label="Select"/>
            <form:options items="${title}" itemValue="title" itemLabel="description"/>
             </form:select>
		      </div>
		    </div>   
		    </div>
		    
   		<div class="row">
   		<div class="form-group col-md-6">
   				      <label class="control-label col-sm-4" for="name">First Name</label>
		      <div class="col-sm-8 input-group">
		       	   <form:input path="firstName" class="form-control"    id="firstName"   placeholder="First Name" autocomplete="off"/> 
		      </div>
		    </div>   
		    
		    
   		    
   		<div class="form-group col-md-6">
   		 <label class="control-label col-sm-4" for="name">Last Name</label>
		      <div class="col-sm-8 input-group">
		       	   <form:input path="lastName" class="form-control"    id="lastName"   placeholder="Last Name" autocomplete="off"/> 
		      </div>
		    </div>   
		    </div>
		    
		    <div class="row">
   		<div class="form-group col-md-6">
   				      <label class="control-label col-sm-4" for="name">Name2</label>
		      <div class="col-sm-8 input-group">
		       	   <form:input path="name2" class="form-control"    id="name2"   placeholder="Name2" autocomplete="off"/> 
		      </div>
		    </div>   
		    
		    
   		    
   		<div class="form-group col-md-6">
   		 <label class="control-label col-sm-4" for="name">Legal Name</label>
		      <div class="col-sm-8 input-group">
		       	   <form:input path="legalName" class="form-control"    id="legalName"   placeholder="Legal Name" autocomplete="off"/> 
		      </div>
		    </div>   
		    </div>
		       
		  <%--    <div class="form-group ">
		      <label class="control-label col-sm-4" for="name">Country2</label>
		      <div class="col-sm-8 input-group">
		       	   
		       	   <form:select path="countrylist" id="countryidd" multiple="true" class="form-control">
   <form:option value="NONE" label="--- Select ---"/>
   
         <form:options items="${country}" itemValue="id" itemLabel="countryName"/>
   
</form:select>
		      </div>
		    </div>   
		    
		   <div class="form-group ">
		      <label class="control-label col-sm-4" for="name">CountryDescription</label>
		      <div class="col-sm-8 input-group">
		       	   
		       	   <form:select path="countrydesc" id="coun" class="form-control">
   
    <form:options items="${desc}" itemValue="id" itemLabel="countryName"/>
</form:select>
		      </div>
		    </div>    --%>
   		
   		
   		
   		<div class="row">
   		<div class="form-group col-md-6">
		      <label class="control-label col-sm-4" for="name">Country</label>
		      <div class="col-sm-8 input-group">
		       	   <form:select path="country" id="countryid"  class="form-control">
   <form:option value="NONE" label="Select"/>
         <form:options items="${country}" itemValue="id" itemLabel="countryName"/>
   </form:select>
		      </div>
		    </div>   
		    
   		      <div class="form-group col-md-6">
		      <label class="control-label col-sm-4" for="name">State</label>
		      <div class="col-sm-8 input-group">
		       	   <form:select path="state" id="comboboxState" class="form-control">
             <form:option  value="NONE" label="Select"/>
            <form:options items="${state}" itemValue="stateid" itemLabel="stateName"/>
             </form:select>
		      </div>
		    </div>   
		    </div>
		    
		    <div class="row">
   		<div class="form-group col-md-6">
   				      <label class="control-label col-sm-4" for="name">House No</label>
		      <div class="col-sm-8 input-group">
		       	   <form:input path="house" class="form-control"    id="house"   placeholder="House No" autocomplete="off"/> 
		      </div>
		    </div>   
		    
		    
   		    
   		<div class="form-group col-md-6">
   		 <label class="control-label col-sm-4" for="name">Street</label>
		      <div class="col-sm-8 input-group">
		       	   <form:input path="street" class="form-control"    id="street"   placeholder="Street" autocomplete="off"/> 
		      </div>
		    </div>   
		    </div>
		    
		    <div class="row">
   		<div class="form-group col-md-6">
   				      <label class="control-label col-sm-4" for="name">Street1</label>
		      <div class="col-sm-8 input-group">
		       	   <form:input path="street1" class="form-control"    id="street1"   placeholder="Street1" autocomplete="off"/> 
		      </div>
		    </div>   
		    
		    
   		    
   		<div class="form-group col-md-6">
   		 <label class="control-label col-sm-4" for="name">Street2</label>
		      <div class="col-sm-8 input-group">
		       	   <form:input path="street2" class="form-control"    id="street2"   placeholder="Street2" autocomplete="off"/> 
		      </div>
		    </div>   
		    </div>
		    
		    
		     <div class="row">
   		<div class="form-group col-md-6">
   				      <label class="control-label col-sm-4" for="name">Pin Code</label>
		      <div class="col-sm-8 input-group">
		       	   <form:input path="pincode" class="form-control"    id="pincode"   placeholder="Pin Code" autocomplete="off"/> 
		      </div>
		    </div>   
		    
		    
   		    
   		<div class="form-group col-md-6">
   		 <label class="control-label col-sm-4" for="name">City</label>
		      <div class="col-sm-8 input-group">
		       	   <form:input path="city" class="form-control"    id="city"   placeholder="City" autocomplete="off"/> 
		      </div>
		    </div>   
		    </div>
		    
		    
		     <div class="row">
   		<div class="form-group col-md-6">
   				      <label class="control-label col-sm-4" for="name">Fax Number</label>
		      <div class="col-sm-8 input-group">
		       	   <form:input path="faxNumber" class="form-control"    id="faxNumber"   placeholder="Fax Number" autocomplete="off"/> 
		      </div>
		    </div>   
		    
		    
   		    
   		<div class="form-group col-md-6">
   		 <label class="control-label col-sm-4" for="name">Telephone No</label>
		      <div class="col-sm-8 input-group">
		       	   <form:input path="telephone" class="form-control"    id="telephone"   placeholder="Telephone No" autocomplete="off"/> 
		      </div>
		    </div>   
		    </div>
		    
		     <div class="row">
   		<div class="form-group col-md-6">
   				      <label class="control-label col-sm-4" for="name">Mobile Number</label>
		      <div class="col-sm-8 input-group">
		       	   <form:input path="mobile" class="form-control"    id="mobile"   placeholder="Mobile Number" autocomplete="off"/> 
		      </div>
		    </div>   
		    
		    
   		    
   		<div class="form-group col-md-6">
   		 <label class="control-label col-sm-4" for="name">EMail Id</label>
		      <div class="col-sm-8 input-group">
		       	   <form:input path="emailId" class="form-control"    id="emailId"   placeholder="EMail Id" autocomplete="off"/> 
		      </div>
		    </div>   
		    </div>
		    
		    
		  <div class="row">
   		<div class="form-group col-md-6">
		      <label class="control-label col-sm-4" for="name">GST Filing</label>
		      <div class="col-sm-8 input-group">
		       	   <form:select path="gstFileingCode" id="gstFileing"  class="form-control">
   <form:option value="NONE" label="Select"/>
         <form:options items="${gstfiling}" itemValue="gstfileing" itemLabel="description"/>
   </form:select>
		      </div>
		    </div>   
		    
   		      <div class="form-group col-md-6">
		      <label class="control-label col-sm-4" for="name">Material Type</label>
		      <div class="col-sm-8 input-group">
		       	   <form:select path="materialaTypeCode" id="materialaType" class="form-control">
             <form:option  value="NONE" label="Select"/>
            <form:options items="${materialtype}" itemValue="materialtype" itemLabel="description"/>
             </form:select>
		      </div>
		    </div>   
		    </div>
		    
		    <div class="row">
   		<div class="form-group col-md-6">
   				      <label class="control-label col-sm-4" for="name">Sales Person</label>
		      <div class="col-sm-8 input-group">
		       	   <form:input path="salesPerson" class="form-control"    id="salesPerson"   placeholder="Sales Person" autocomplete="off"/> 
		      </div>
		    </div>   
		    
		    
   		    
   		<div class="form-group col-md-6">
   		 <label class="control-label col-sm-4" for="name">Sales Person Tel. No</label>
		      <div class="col-sm-8 input-group">
		       	   <form:input path="salesPersonTeleNo" class="form-control"    id="salesPersonTeleNo"   placeholder="Sales Person Tel. No" autocomplete="off"/> 
		      </div>
		    </div>   
		    </div>
		    
		    
		      
		    
		     <div class="row">
   		<div class="form-group col-md-6">
		      <label class="control-label col-sm-4" for="name">Bank Key</label>
		      <div class="col-sm-8 input-group">
		       	   <form:select path="bankKey" id="comboboxBankKey"  class="form-control">
   <form:option value="NONE" label="Select"/>
         <form:options items="${bankkey}" itemValue="bankkey" itemLabel="bankkey"/>
   </form:select>
		      </div>
		    </div>   
		    
   		      <div class="form-group col-md-6">
		      <label class="control-label col-sm-4" for="name">Bank Name</label>
		      <div class="col-sm-8 input-group">
		       	   <form:select path="bankName" id="comboboxBankName" class="form-control">
            
<%--             <form:options items="${state}" itemValue="stateid" itemLabel="stateName"/>
 --%>             </form:select>
		      </div>
		    </div>   
		    </div> 
		    
		    
		    
		     <div class="row">
   		<div class="form-group col-md-6">
   				      <label class="control-label col-sm-4" for="name">Bank Account No</label>
		      <div class="col-sm-8 input-group">
		       	   <form:input path="bankaccountno" class="form-control"    id="bankaccountno"   placeholder="Sales Person" autocomplete="off"/> 
		      </div>
		    </div>   
		    
		    
   		    
   		<div class="form-group col-md-6">
   		 <label class="control-label col-sm-4" for="name">Incoterm</label>
		      <div class="col-sm-8 input-group">
		       	   <form:select path="incoterm" id="incoterm"  class="form-control">
   <form:option value="NONE" label="Select"/>
         <form:options items="${incoterm}" itemValue="incoterm" itemLabel="description"/>
   </form:select>
		      </div>
		    </div>   
		    </div>
		    
		    <div class="row">
   		<div class="form-group col-md-6">
		      <label class="control-label col-sm-4" for="name">Currency</label>
		      <div class="col-sm-8 input-group">
		       	   <form:select path="currency" id="currency"  class="form-control">
   <form:option value="NONE" label="Select"/>
         <form:options items="${currency}" itemValue="id" itemLabel="currency"/>
   </form:select>
		      </div>
		    </div>   
		    
   		      <div class="form-group col-md-6">
		      <label class="control-label col-sm-4" for="name">Payment Term</label>
		      <div class="col-sm-8 input-group">
		       	   <form:select path="paymentterm" id="paymentterm" class="form-control">
             <form:option  value="NONE" label="Select"/>
            <form:options items="${paymentterm}" itemValue="paymentterm" itemLabel="description"/>
             </form:select>
		      </div>
		    </div>   
		    </div>
		    
		    
		    
		     <div class="row">
   		<div class="form-group col-md-6">
		      <label class="control-label col-sm-4" for="name">Payment Methods</label>
		      <div class="col-sm-8 input-group">
		       	   <form:select path="paymentethods" id="paymentmethods" multiple="true"  class="form-control">
   <form:option value="NONE" label="--- Select ---"/>
                    <form:options items="${pmethod}" itemValue="paymentmethod" itemLabel="paymentmethod"/>
 
   </form:select>
		      </div>
		    </div>   
		    
   		      <div class="form-group col-md-6">
		      <label class="control-label col-sm-4" for="name">Vendor Class.(GST Category)</label>
		      <div class="col-sm-8 input-group">
		       	   <form:select path="VendorClass" id="vendorclass"  class="form-control">
             <form:option  value="NONE" label="Select"/>
                      <form:options items="${venderclass}" itemValue="gstvendorclass" itemLabel="description"/>
             
             </form:select>
		      </div>
		    </div>   
		    </div> 
		    
		      <div class="row">
   		<div class="form-group col-md-6">
   				      <label class="control-label col-sm-4" for="name">PAN No</label>
		      <div class="col-sm-8 input-group">
		       	   <form:input path="panno" class="form-control"    id="panno"   placeholder="PAN No" autocomplete="off"/> 
		      </div>
		    </div>   
		    
		    
   		    
   		<div class="form-group col-md-6">
   		 <label class="control-label col-sm-4" for="name">Adhaar No</label>
		      <div class="col-sm-8 input-group">
		       	   <form:input path="adhaarNo" class="form-control"    id="adhaarNo"   placeholder="Adhaar No" autocomplete="off"/> 
		      </div>
		    </div>   
		    </div>
		    
		      <div class="row">
   		<div class="form-group col-md-6">
   				      <label class="control-label col-sm-4" for="name">GST No</label>
		      <div class="col-sm-8 input-group">
		       	   <form:input path="gstno" class="form-control"    id="gstno"   placeholder="GST No" autocomplete="off"/> 
		      </div>
		    </div>   
		    
		    
   		    
   		<div class="form-group col-md-6">
   		  <label class="control-label col-sm-4" for="name">GLCode</label>
		      <div class="col-sm-8 input-group">
		       	   <form:select path="glCode" id="glcode" class="form-control">
            
<%--             <form:options items="${state}" itemValue="stateid" itemLabel="stateName"/>
 --%>             </form:select>
		      </div>
		    </div>   
		    </div>
		    
		    
		     
		     <div class="row">
   		<div class="form-group col-md-6">
		      <label class="control-label col-sm-4" for="name">Legal Entity</label>
		      <div class="col-sm-8 input-group">
		       	   <form:select path="legalEntityCode" id="legalEntity"  class="form-control">
   <form:option value="NONE" label="--- Select ---"/>
         <form:options items="${legalentity}" itemValue="legalentity" itemLabel="description"/>
   </form:select>
		      </div>
		    </div>   
		    
   		      <div class="form-group col-md-6">
		      <label class="control-label col-sm-4" for="name">ID Type</label>
		      <div class="col-sm-8 input-group">
		       	   <form:select path="idTypeCode" id="idType" class="form-control">
             <form:option  value="NONE" label="Select"/>
            <form:options items="${idtype}" itemValue="idtype" itemLabel="description"/>
             </form:select>
		      </div>
		    </div>   
		    </div>
		    
		    <div class="row">
   		<div class="form-group col-md-6">
   				      <label class="control-label col-sm-4" for="name">Identification Number</label>
		      <div class="col-sm-8 input-group">
		       	   <form:input path="identificationNumber" class="form-control"    id="identificationNumber"   placeholder="Identification Number" autocomplete="off"/> 
		      </div>
		    </div>   
		    
		    
   		    
   		<div class="form-group col-md-6">
   		 <label class="control-label col-sm-4" for="name">Payment Block</label>
		      <div class="col-sm-8 input-group">
		       	   <form:select path="paymentBlockCode" id="paymentBlock"  class="form-control">
   <form:option value="NONE" label="Select"/>
         <form:options items="${paymentblock}" itemValue="paymentblock" itemLabel="description"/>
   </form:select>
		      </div>
		    </div>   
		    </div>
		    
		    
		     <div class="row">
   		<div class="form-group col-md-6">
   				      <label class="control-label col-sm-4" for="name">Inco. Location1</label>
		      <div class="col-sm-8 input-group">
		       	   <form:input path="incoLocation1" class="form-control"    id="incolocation1"   placeholder="Inco. Location1" autocomplete="off"/> 
		      </div>
		    </div>   
		    
		    
   		    
   		<div class="form-group col-md-6">
   		 <label class="control-label col-sm-4" for="name">Actual QM sys</label>
		      <div class="col-sm-8 input-group">
		       	   <form:select path="actualQmSys" id="actualQmSys"  class="form-control">
   <form:option value="NONE" label="Select"/>
         <form:options items="${actualqmsys}" itemValue="actualqmsyss" itemLabel="description"/>
   </form:select>
		      </div>
		    </div>   
		    </div> 
		    
		    
		    
		    <%--  <div class="form-group ">
		      <label class="control-label col-sm-4" for="name">City</label>
		      <div class="col-sm-8 input-group">
		       	   
		       	   <form:select path="city" id="comboboxCity" class="form-control">
      <form:option  value="NONE" label="--- Select ---"/>
   
              <form:options items="${city}" itemValue="cityid" itemLabel="cityName"/>
  
   
</form:select>
		      </div>
		    </div>    --%>
		    
		   <%--  
		    <div class="form-group ">
		      <label class="control-label col-sm-4" for="name">paymentmethod</label>
		      <div class="col-sm-8 input-group">
		       	   
		       	   <form:select path="paymentlist" id="paymentid" multiple="true" class="form-control">
   
          <form:options items="${pmethod}" itemValue="paymentid" itemLabel="paymentName"/> 
   
</form:select>
		      </div>
		    </div>    --%>
		    
   		</div>
   						
			<div class="col-md-3 col-md-offset-8">
   		<input type="submit"  name="Save" class="btn btn-primary form-control"  value="Save"/></div>
   		
   		</div>
   		</div>
   		
   		
   		</div>
		
   		
   		
		
		
		</form:form>
	
	
		
		<p>
			<a href="${pageContext.request.contextPath}/customer/list">Back to List</a>
		</p>
	
	

</body>

</html>










