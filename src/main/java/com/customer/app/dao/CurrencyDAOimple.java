package com.customer.app.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.customer.app.entity.ActualQmSys;
import com.customer.app.entity.Country;
import com.customer.app.entity.Currency;
import com.customer.app.entity.GSTFiling;

@Repository
public  class CurrencyDAOimple implements CurrencyDAO {

	// need to inject the session factory
		@Autowired
		private SessionFactory sessionFactory;
				

	

	@Override
	public List<Currency> getCurrency() {
		// TODO Auto-generated method stub
Session currentSession = sessionFactory.getCurrentSession();
		
		// create a query  ... sort by last name
		Query<Currency> theQuery = 
				currentSession.createQuery("from Currency",
						Currency.class);
		
		// execute query and get result list
		List<Currency> customers = theQuery.getResultList();
				
		// return the results		
		return customers;
	}

	
	


}
