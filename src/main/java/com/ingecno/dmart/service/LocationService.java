package com.ingecno.dmart.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ingecno.dmart.dao.LocationDao;
import com.ingecno.dmart.masterData.City;


@Service
public class LocationService {
	
	@Autowired
	LocationDao locationDao;
	
	public LocationDao getLocationDao() {
		return locationDao;
	}

	public void setLocationDao(LocationDao locationDao) {
		this.locationDao = locationDao;
	}

	@Transactional
	public Map<String, Map<String,List<String>>> getLocations(){
		
	List<City> cities=locationDao.getLocations();
	
	Map<String, Map<String,List<String>>> mapLocaton=getTotalMap(cities);
	
	return mapLocaton;
	}

	
	public static Map<String, Map<String,List<String>>> getTotalMap(List<City> cities){
	
		Map<String, Map<String,List<String>>> mapLocator=new HashMap<String, Map<String,List<String>>>();
		HashMap<String, List<String>> hm=new HashMap<String, List<String>>();
		List<String> cityl=new ArrayList<String>();
		
		for(City city:cities){
//		System.out.println(city.getCityName()+" "+city.getState().getStateName()+" "+city.getCountry().getCountryName());
		
		
	if(mapLocator.containsKey(city.getCountry().getCountryName())) {
	
		if(hm.containsKey(city.getState().getStateName())) {
			cityl.add(city.getCityName());
		}else {
			 cityl=new ArrayList<String>();
			 cityl.add(city.getCityName());
			 hm.put(city.getState().getStateName(),cityl);
		}
		}else {
			cityl=new ArrayList<String>();
			cityl.add(city.getCityName());
			
			hm=new HashMap<String, List<String>>();
			
			hm.put(city.getState().getStateName(),cityl);
			mapLocator.put(city.getCountry().getCountryName(),hm);
		}
	System.out.println("////////");
	System.out.println(mapLocator);
	}	
		return mapLocator;
	}
}


