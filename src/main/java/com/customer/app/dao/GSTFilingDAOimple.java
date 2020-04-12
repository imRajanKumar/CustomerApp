package com.customer.app.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.customer.app.entity.ActualQmSys;
import com.customer.app.entity.Country;
import com.customer.app.entity.GSTFiling;

@Repository
public  class GSTFilingDAOimple implements GSTFilingDAO {

	// need to inject the session factory
		@Autowired
		private SessionFactory sessionFactory;
				

	@Override
	public List<GSTFiling> getGSTFiling() {
Session currentSession = sessionFactory.getCurrentSession();
		
		// create a query  ... sort by last name
		Query<GSTFiling> theQuery = 
				currentSession.createQuery("from GSTFiling",
						GSTFiling.class);
		
		// execute query and get result list
		List<GSTFiling> customers = theQuery.getResultList();
				
		// return the results		
		return customers;
	}

	
	


}
