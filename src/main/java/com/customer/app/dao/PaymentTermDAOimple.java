package com.customer.app.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.customer.app.entity.ActualQmSys;
import com.customer.app.entity.Country;
import com.customer.app.entity.PaymentTerm;

@Repository
public  class PaymentTermDAOimple implements PaymentTermDAO {

	// need to inject the session factory
		@Autowired
		private SessionFactory sessionFactory;
				

	@Override
	public List<PaymentTerm> getPaymentTerm() {
Session currentSession = sessionFactory.getCurrentSession();
		
		// create a query  ... sort by last name
		Query<PaymentTerm> theQuery = 
				currentSession.createQuery("from PaymentTerm",
						PaymentTerm.class);
		// execute query and get result list
		List<PaymentTerm> customers = theQuery.getResultList();
				
		// return the results		
		return customers;
	}

	
	


}
