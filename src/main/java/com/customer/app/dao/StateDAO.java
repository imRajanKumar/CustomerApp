package com.customer.app.dao;

import java.util.List;

import com.customer.app.entity.Country;
import com.customer.app.entity.State;


public interface StateDAO {

	public List<State> getState(String id);

}
