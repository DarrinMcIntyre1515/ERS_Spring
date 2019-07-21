package com.mcintyre.ers.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mcintyre.ers.dao.UserRepo;
import com.mcintyre.ers.model.User;

@RestController
public class UserController {
	@Autowired
	UserRepo repo;
	
	@RequestMapping("/homee")
	public String login() {
		return "home!!!";
	}
	
	// For web services we don't need a model and view object
	@PostMapping(path="/testLogin")
	public User verifyUser(@RequestBody String username, @RequestBody String password) {
		System.out.println("In verifyUser!");
		User user = new User();

		return user;
	}

}
