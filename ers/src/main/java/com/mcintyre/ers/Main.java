package com.mcintyre.ers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import com.mcintyre.ers.model.Quote;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {      
		SpringApplication.run(Main.class, args);	
	}

}
