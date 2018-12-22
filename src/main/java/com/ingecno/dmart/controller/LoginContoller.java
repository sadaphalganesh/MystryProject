package com.ingecno.dmart.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ingecno.dmart.model.User;
import com.ingecno.dmart.model.UserDetails;

@Controller
public class LoginContoller {
	
	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public UserDetails getUserDetails() {
		return userDetails;
	}


	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}

	@Autowired
	User user;
	
	@Autowired
	UserDetails userDetails;
	
	
	
	

	@RequestMapping(path="/login")
	public String signUp(Model model) {
		//User user=new User();
		model.addAttribute(user);
		return "signupForm";
	}
	
	
	@RequestMapping(path="/saveUserData")
	public ModelAndView saveUserData(@ModelAttribute("user") User user,HttpServletRequest request) {
		
		HttpSession session=request.getSession();
		session.setAttribute("user",user);
		
		//UserDetails userDetails=new UserDetails();
		
		
		ModelAndView modelAndView=new ModelAndView("userDetails");
		modelAndView.addObject(userDetails);
		return modelAndView;
	}
	
	@RequestMapping(path="/saveUserDetails")
	public ModelAndView saveUserDetails(@ModelAttribute("userDetails") UserDetails userDetails,HttpServletRequest request) {
		
		HttpSession session=request.getSession(false);
		User user=(User)session.getAttribute("user");
		System.out.println(user);
		System.out.println("////////////////////");
		System.out.println(userDetails);
		
		
		
		System.out.println(userDetails.getFirstName());
		return new ModelAndView("success");
	}
		
}
