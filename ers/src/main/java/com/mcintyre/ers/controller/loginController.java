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
	

	@RequestMapping(value = {"login", ""}, method = RequestMethod.GET)
	public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView("login");
		mv.addObject("login", new LoginForm());
		return mv;
	}
	
	@RequestMapping(value = "logout", method = RequestMethod.GET)
	public ModelAndView logout(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView("login");

		mv.addObject("login", new LoginForm());
		mv.addObject("message", "");
		return mv;
	}
	
	@RequestMapping(value = "registration", method = RequestMethod.GET)
	public ModelAndView registerUser(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView("register");

		mv.addObject("user", new User());
		return mv;
	}
	
	@PostMapping(value = "verifyLogin")
	public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
			  @ModelAttribute("login") LoginForm login) {
		ModelAndView mv = null;
		
		User usr = repo.findByUsernameOrEmail(login.getUsername(), login.getUsername());
		
		if(usr != null && usr.getPassword().contains(login.getPassword())) {
			mv = new ModelAndView("welcome");
			mv.addObject("firstname", usr.getFirstname());
		}
		else {
			mv = new ModelAndView("login");
			mv.addObject("message", "Incorrect username or password.");
		}		
		
		return mv;
	}
	
	@PostMapping(value = "registerUser")
	public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
			  @ModelAttribute("user") User usr) {
		ModelAndView mv = null;
		
		repo.save(usr);
		
		mv = new ModelAndView("login");
		mv.addObject("login", new LoginForm());
		mv.addObject("message", "Registration completed.");
		
		return mv;
	}
	
}
