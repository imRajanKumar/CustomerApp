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

	  $('#countryid').on('change', function(){
		var countryId = $(this).val();
		 $.ajax({
			type: 'GET',
			url: '${pageContext.request.contextPath }/customer/loadStatesByCountry/' + countryId,
			success: function(result) {
				
				
				var result = JSON.parse(result);
				//var s = '';
				var s='<option value=""><strong>Select</strong></option>';
				for(var i = 0; i < result.length; i++) {
					s += '<option value="' + result[i].stateid + '">' + result[i].stateName + '</option>';
				}
				
				
				$('#comboboxState').html(s);
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
   		<div class="col-md-6">
   		
   		
   		
   		<div class="form-group ">
		      <label class="control-label col-sm-4" for="name">First Name</label>
		      <div class="col-sm-8 input-group">
		       	   <form:input path="firstName" class="form-control"    id="address3"   placeholder="First Name" autocomplete="off"/> 
        	   
		      </div>
		    </div>   
   		
   		
   		
		    
		    
		    
		    
		   <div class="form-group ">
		      <label class="control-label col-sm-4" for="name">Country</label>
		      <div class="col-sm-8 input-group">
		       	   
		       	   <form:select path="country" id="countryid" class="form-control">
   <form:option value="NONE" label="--- Select ---"/>
   
   
         <form:options items="${country}" itemValue="id" itemLabel="countryName"/>
   
</form:select>
		      </div>
		    </div>   
		    
		    
		    
		    
		     
   		 </div>
   		
   		
   		
   		
   		<div class="col-md-6">
   		<div class="form-group ">
		      <label class="control-label col-sm-4" for="name">Last Name</label>
		      <div class="col-sm-8 input-group">
		       	   <form:input path="lastName" class="form-control"    id="lastname"   placeholder="Last Name" autocomplete="off"/> 
        	  
		      </div>
		    </div>   
		    
		    <div class="form-group ">
		      <label class="control-label col-sm-4" for="name">State</label>
		      <div class="col-sm-8 input-group">
		       	   
		       	   <form:select path="state" id="comboboxState" class="form-control">
      <form:option  value="NONE" label="--- Select ---"/>
   
   
   
</form:select>
		      </div>
		    </div>   
		    
   		</div>
   		
   		
   			
					
			<div class="col-md-3 col-md-offset-8">
   		<input type="submit"  name="Save" class="btn btn-primary form-control"  value="Save"/></div>
   		
   		</div>
   		</div>
   		</div>
   		</div>
   		
   		
		
   		
   		
		
		
		</form:form>
	
	
		
		<p>
			<a href="${pageContext.request.contextPath}/customer/list">Back to List</a>
		</p>
	
	

</body>

</html>










