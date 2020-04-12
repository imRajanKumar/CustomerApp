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
import com.customer.app.entity.IDType;

@Repository
public  class IDTypeDAOimple implements IDTypeDAO {

	// need to inject the session factory
		@Autowired
		private SessionFactory sessionFactory;
				

	


	@Override
	public List<IDType> getIDType() {
		
		Session currentSession = sessionFactory.getCurrentSession();

		// create a query  ... sort by last name
				Query<IDType> theQuery = 
						currentSession.createQuery("from IDType",
								IDType.class);
				
				// execute query and get result list
				List<IDType> customers = theQuery.getResultList();
						
				// return the results		
				return customers;
	}

	
	


}
