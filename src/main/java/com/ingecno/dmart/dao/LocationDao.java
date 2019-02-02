package com.ingecno.dmart.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ingecno.dmart.masterData.City;


@Repository
public class LocationDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public List<City> getLocations() {
		return sessionFactory.getCurrentSession().createQuery("from City").list();
	}
}
