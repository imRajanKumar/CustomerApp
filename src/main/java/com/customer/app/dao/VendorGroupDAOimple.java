package com.customer.app.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.customer.app.entity.ActualQmSys;
import com.customer.app.entity.Country;
import com.customer.app.entity.VenderGroup;

@Repository
public class VendorGroupDAOimple implements VendorGroupDAO {

	// need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<VenderGroup> getVendorGroup() {

		Session currentSession = sessionFactory.getCurrentSession();
		// create a query ... sort by last name
		Query<VenderGroup> theQuery = currentSession.createQuery("from VenderGroup", VenderGroup.class);
		// execute query and get result list
		List<VenderGroup> customers = theQuery.getResultList();
		// return the results
		return customers;
	}

	@Override
	public List<VenderGroup> getGLCode(String venderGroup) {
		// TODO Auto-generated method stub
		Session currentSession = sessionFactory.getCurrentSession();
		// create a query ... sort by last name
		Query<VenderGroup> theQuery = currentSession.createQuery("from VenderGroup where vendor_group=:c", VenderGroup.class);
		// execute query and get result list
		theQuery.setParameter("c", venderGroup);
		List<VenderGroup> customers = theQuery.getResultList();
		// return the results
		return customers;
	}

}
