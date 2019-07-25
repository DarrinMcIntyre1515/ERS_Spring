package com.mcintyre.ers;

import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {    
		
		System.out.println("******Environment Vars******");
        Map<String, String> enviorntmentVars  = System.getenv();
        enviorntmentVars.entrySet().forEach(System.out::println);
		
		SpringApplication.run(Main.class, args);	
	}

}
