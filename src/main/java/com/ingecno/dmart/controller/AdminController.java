package com.ingecno.dmart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {

	@RequestMapping(path="/login")
	public String helloMethodinJava() {
		return "loginPage";
	}
	
//line is changed
	
	
	
}
