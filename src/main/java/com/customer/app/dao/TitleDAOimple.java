package com.customer.app.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.customer.app.entity.ActualQmSys;
import com.customer.app.entity.Country;
import com.customer.app.entity.Title;

@Repository
public  class TitleDAOimple implements TitleDAO {

	// need to inject the session factory
		@Autowired
		private SessionFactory sessionFactory;

	@Override
	public List<Title> getTitle() {
		// TODO Auto-generated method stub
Session currentSession = sessionFactory.getCurrentSession();
		
		// create a query  ... sort by last name
		Query<Title> theQuery = 
				currentSession.createQuery("from Title",
						Title.class);
		
		// execute query and get result list
		List<Title> customers = theQuery.getResultList();
				
		// return the results		
		return customers;	}

}
