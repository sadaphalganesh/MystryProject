package com.ingecno.dmart.masterData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class LocationTest {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		
		Session session=sessionFactory.openSession();
		
		session.beginTransaction();
		
		Query<City> query=session.createQuery("from City");
	/*	
		query.setFirstResult(1);
		query.setMaxResults(4);
		*/
		List<City> cities=query.list();
		
		Map<String, Map<String,List<String>>> mapLocato=getTotalMap(cities);
		
		System.out.println(mapLocato.get("India").get("Maharashtra"));

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
		
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
	

