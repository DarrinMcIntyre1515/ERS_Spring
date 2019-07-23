package com.mcintyre.ers.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.mcintyre.ers.dao.UserRepo;
import com.mcintyre.ers.model.Quote;
import com.mcintyre.ers.model.User;

@RestController
public class ConsumeController {
	@Autowired
	UserRepo repo;
	
	@RequestMapping("/quote")
	public Quote greeting() {
		RestTemplate restTemplate = new RestTemplate();
		Quote quote = restTemplate.getForObject("https://gturnquist-quoters.cfapps.io/api/random", Quote.class);
		System.out.println(quote.getValue().getQuote() + "\n");
		return quote;
	}
	
	@PostMapping("/testLogin")
	public User verifyUser(@RequestBody String username, @RequestBody String password) {
		System.out.println("In verifyUser!");
		User user = new User();

		return user;
	}

}

