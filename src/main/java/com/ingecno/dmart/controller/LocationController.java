package com.ingecno.dmart.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ingecno.dmart.service.LocationService;

@Controller
public class LocationController {

	@Autowired
	LocationService locationService;
	
	@RequestMapping(value="/locations")
	public ModelAndView getLocations() {
		
		Map<String, Map<String, List<String>>> locations=locationService.getLocations();
		System.out.println(locations);
	
		ModelAndView modelAndView=new ModelAndView("locationsDemo");
		modelAndView.addObject("country",locations.keySet());
		modelAndView.addObject("state",locations);
		return modelAndView;
	}
	
}
