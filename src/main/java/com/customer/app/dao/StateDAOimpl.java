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
@Repository
public class StateDAOimpl implements StateDAO {

	
	// need to inject the session factory
		@Autowired
		private SessionFactory sessionFactory;
				
	
	@Override
	public List<State> getState(String id) {
		// TODO Auto-generated method stub
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		// create a query  ... sort by last name
		Query<State> theQuery = 
				currentSession.createQuery("from State order where countryid=:c",
											State.class);
		theQuery.setParameter("c", id);
		// execute query and get result list
		List<State> customers = theQuery.getResultList();
				
		// return the results		
		return customers;
		
		
	}


}
