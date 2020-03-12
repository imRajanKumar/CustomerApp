package com.customer.app.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.customer.app.dao.CityDAO;
import com.customer.app.entity.City;

@Service
public class CityServiceimple implements CityService {
	@Autowired
	private CityDAO cityDAO;

	@Override
	@Transactional
	public List<City> getCity(String id) {
		// TODO Auto-generated method stub
		return cityDAO.getCity(id)
				;
	}

}
