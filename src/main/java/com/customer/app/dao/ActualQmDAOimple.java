package com.customer.app.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.customer.app.entity.ActualQmSys;
import com.customer.app.entity.Country;

@Repository
public class ActualQmDAOimple implements ActualQmDAO {

	// need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<ActualQmSys> getActualqm() {
		Session currentSession = sessionFactory.getCurrentSession();

		// create a query ... sort by last name
		Query<ActualQmSys> theQuery = currentSession.createQuery("from ActualQmSys", ActualQmSys.class);

		// execute query and get result list
		List<ActualQmSys> customers = theQuery.getResultList();

		// return the results
		return customers;
	}

}
