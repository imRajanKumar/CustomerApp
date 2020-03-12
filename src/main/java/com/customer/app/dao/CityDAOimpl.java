package com.customer.app.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.customer.app.entity.City;
import com.customer.app.entity.Country;
import com.customer.app.entity.Customer;
import com.customer.app.entity.State;
@Repository
public class CityDAOimpl implements CityDAO {

	
	// need to inject the session factory
		@Autowired
		private SessionFactory sessionFactory;
				
	
	

	@Override
	public List<City> getCity(String id) {
Session currentSession = sessionFactory.getCurrentSession();
		
		// create a query  ... sort by last name
		Query<City> theQuery = 
				currentSession.createQuery("from City order where stateid=:c",
											City.class);
		theQuery.setParameter("c", id);
		// execute query and get result list
		List<City> customers = theQuery.getResultList();
				
		// return the results		
		return customers;
		
	}


}
