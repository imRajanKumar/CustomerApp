package com.customer.app.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.customer.app.entity.BankKey;
import com.customer.app.entity.Country;
import com.customer.app.entity.Customer;
import com.customer.app.entity.State;
@Repository
public class BankKeyDAOimpl implements BankKeyDAO {

	
	// need to inject the session factory
		@Autowired
		private SessionFactory sessionFactory;
				
	@Override
	public List<BankKey> getBankKey(String id) {
		// TODO Auto-generated method stub
Session currentSession = sessionFactory.getCurrentSession();
		
		// create a query  ... sort by last name
		Query<BankKey> theQuery = 
				currentSession.createQuery("from BankKey order where countryid=:c",
						BankKey.class);
		theQuery.setParameter("c", id);
		// execute query and get result list
		List<BankKey> customers = theQuery.getResultList();
				
		// return the results		
		return customers;
	}

	@Override
	public List<BankKey> getBankName(String bankKey) {
		// TODO Auto-generated method stub
Session currentSession = sessionFactory.getCurrentSession();
		
		// create a query  ... sort by last name
		Query<BankKey> theQuery = 
				currentSession.createQuery(" from BankKey   where bankkey=:c",BankKey.class);
		theQuery.setParameter("c", bankKey);
		// execute query and get result list
		List<BankKey> customers = theQuery.getResultList();
				
		
		System.out.println("********************************"+customers);
		// return the results		
		return customers;
	}


}
