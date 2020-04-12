package com.customer.app.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.customer.app.entity.Country;
import com.customer.app.entity.Customer;
import com.customer.app.entity.State;
import com.customer.app.entity.VendorClass;
@Repository
public class VendorClassDAOimpl implements VendorClassDAO {

	
	// need to inject the session factory
		@Autowired
		private SessionFactory sessionFactory;
				
	
	

	@Override
	public List<VendorClass> getVendorClass(String vendortype) {
		// TODO Auto-generated method stub
Session currentSession = sessionFactory.getCurrentSession();
		
		// create a query  ... sort by last name
		Query<VendorClass> theQuery = 
				currentSession.createQuery("from VendorClass order where vendortype=:c",
						VendorClass.class);
		theQuery.setParameter("c", vendortype);
		// execute query and get result list
		List<VendorClass> customers = theQuery.getResultList();
				
		// return the results		
		return customers;
	}


}
