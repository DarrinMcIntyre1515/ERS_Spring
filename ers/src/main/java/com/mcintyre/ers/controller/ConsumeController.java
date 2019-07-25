package com.mcintyre.ers.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.mcintyre.ers.model.Quote;

@RestController
public class ConsumeController {
	
	@RequestMapping("/quote")
	public Quote greeting() {
		RestTemplate restTemplate = new RestTemplate();
		Quote quote = restTemplate.getForObject("https://gturnquist-quoters.cfapps.io/api/random", Quote.class);
		return quote;
	}
}

