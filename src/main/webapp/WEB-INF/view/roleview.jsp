

<%@page import="com.customer.app.dao.CustomerDAOImpl"%>
<%@page import="com.customer.app.entity.Customer"%>
<%@page import="com.customer.app.service.CustomerServiceImpl"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ page import="java.util.*" %>
              <%@ page import="java.sql.*"%>
      
                <%@ page isELIgnored="false" %>
                    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html lang="en">
<head>
 <title>Table</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    
  <link rel="stylesheet" href="https://cdn.datatables.net/1.10.19/css/dataTables.bootstrap.min.css">

<script src="https://code.jquery.com/jquery-3.3.1.js"></script>
<script src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js"></script>
<script src="https://cdn.datatables.net/1.10.19/js/dataTables.bootstrap.min.js"></script>
  <script>
$(document).ready(function(){
   // $('#myTable').dataTable();
    $('#myTable').DataTable( {
        "lengthMenu": [[5,10, 25, 50, -1], [5,10, 25, 50, "All"]]
    } );
    
});
</script>
</head>


<body >



<div class="col-md-1">
</div>
<div class="col-md-12">
<div class="table-responsive"><br>

	<table id="myTable" class="display table table-responsive"  >
	<thead>
	      <tr>
	        		
	                
	               <th>MDMVendorCode</th>
	               <th>VendorGroup</th>
	                <th>FirstName</th>
	               <th>LastName</th>
	               	               
	               
 
	                
	                
	           </tr>
	    </thead>
	    
	   <tbody>
		  
		 	    	
		 
	   <c:forEach items="${customers}" var="abcd">
	   <c:url var="updateLink" value="/customer/showFormForUpdate">
						<c:param name="customerId" value="${abcd.id}" />
					</c:url>
		 
	    <tr>
	    <td><a  id="edt" href="${updateLink}">${abcd.id}</a>	</td>
      
               <td>${abcd.venderGroup}</td>
               
        
        
       <td>${abcd.firstName}</td>
            <td>${abcd.lastName}	</td>
                        
                                                  
                                                  
                                                  
                                               
	    
	    
	    
	        
	  	</tr>
	 	</c:forEach>
	 
                       
                                               
	    
	    
	    
	        
	  	</tr>
	 
	</tbody>
	</table>
</div>
</div>

</body>
</html>







