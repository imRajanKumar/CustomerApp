package com.customer.app.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.customer.app.entity.Country;
@Repository
public class CountryDAOimple implements CountryDAO {

	
	// need to inject the session factory
		@Autowired
		private SessionFactory sessionFactory;
				
	public List<Country> getCountry() {
		// TODO Auto-generated method stub
		
		
		// get the current hibernate session
				Session currentSession = sessionFactory.getCurrentSession();
						
				// create a query  ... sort by last name
				Query<Country> theQuery = 
						currentSession.createQuery("from Country",
													Country.class);
				
				// execute query and get result list
				List<Country> customers = theQuery.getResultList();
						
				// return the results		
				return customers;
	}


}
