package com.mcintyre.ers.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mcintyre.ers.dao.UserRepo;
import com.mcintyre.ers.model.User;

@Controller
public class loginController {

	@Autowired
	UserRepo repo;
	
	@Autowired
	PasswordEncoder pwEncoder;
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/login")
	public String loginPage() {
		return "login";
	}
	
	@RequestMapping("/logout-success")
	public String logoutPage() {
		return "logout";
	}
	
	@RequestMapping("/register")
	public String registerUser() {
		return "register";
	}
	
	@PostMapping("/registration")
	public String registration(HttpServletRequest req, User usr){
		usr.setPassword(pwEncoder.encode(usr.getPassword()));
		repo.save(usr);
		
		return "login";
	}
	
	@RequestMapping(value = "/username", method = RequestMethod.GET)
    @ResponseBody
    public User currentUserName() {
		User usr;
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		
		if (principal instanceof UserDetails) {
		  String username = ((UserDetails)principal).getUsername();
		  usr = repo.findByUsernameOrEmail(username, username);
		} 
		else {
		  usr = null;
		}
		
		return usr;
    }
}
