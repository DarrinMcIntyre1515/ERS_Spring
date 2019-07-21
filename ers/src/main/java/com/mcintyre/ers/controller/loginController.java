package com.mcintyre.ers.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mcintyre.ers.dao.UserRepo;
import com.mcintyre.ers.model.LoginForm;
import com.mcintyre.ers.model.User;

@Controller
public class loginController {

	@Autowired
	UserRepo repo;
	

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("login");
		mav.addObject("login", new LoginForm());
		return mav;
	}
	
//	@RequestMapping(value = "verifyLogin", method = RequestMethod.POST)
	@PostMapping(value = "verifyLogin")
	public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
			  @ModelAttribute("login") LoginForm login) {
		ModelAndView mav = null;
	
		User user = repo.findByUsernameAndPassword(login.getUsername(), login.getPassword());
	
		if (null != user) {
			mav = new ModelAndView("welcome");
			mav.addObject("firstname", user.getUsername());
		}
		else {
			mav = new ModelAndView("login");
			mav.addObject("message", "Incorrect username or password.");
		}
		
//		User usr = repo.findByUsernameOrEmail(login.getUsername(), login.getUsername());
//		
//		if(usr.getPassword() == login.getPassword()) {
//			mav = new ModelAndView("welcome");
//			mav.addObject("firstname", usr.getFirstname());
//		}
//		else {
//			mav = new ModelAndView("login");
//			mav.addObject("message", "Incorrect username or password.");
//		}
		
		
		
		return mav;
}
	
}
