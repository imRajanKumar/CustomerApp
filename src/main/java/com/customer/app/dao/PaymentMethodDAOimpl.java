package com.customer.app.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.customer.app.entity.Country;
import com.customer.app.entity.Customer;
import com.customer.app.entity.PaymentMethod;
import com.customer.app.entity.State;
@Repository
public class PaymentMethodDAOimpl implements PaymentMethodDAO {

	
	// need to inject the session factory
		@Autowired
		private SessionFactory sessionFactory;
				

	@Override
	public List<PaymentMethod> getPaymentMethod(String vendertype) {

		Session currentSession = sessionFactory.getCurrentSession();
		System.out.println("^^^^^^^^^^^^^^^"+vendertype);
		// create a query  ... sort by last name
		Query<PaymentMethod> theQuery = 
				currentSession.createQuery("from PaymentMethod  where vendortype =:c",
											PaymentMethod.class);
		theQuery.setParameter("c", vendertype);
		// execute query and get result list
		List<PaymentMethod> customers = theQuery.getResultList();
		
		System.out.println("*********"+customers);
				
		// return the results		
		return customers;

	}


}
