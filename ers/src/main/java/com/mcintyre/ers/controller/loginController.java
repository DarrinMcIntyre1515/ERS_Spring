package com.mcintyre.ers.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class loginController {

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
	
//	@RequestMapping(value = "registration", method = RequestMethod.GET)
//	public ModelAndView registerUser(HttpServletRequest request, HttpServletResponse response) {
//		mv.setViewName("register");
//
//		mv.addObject("user", new User());
//		return mv;
//	}
//	
//	@PostMapping(value = "registerUser")
//	public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
//			  @ModelAttribute("user") User usr) {
//		mv = null;
//		
//		repo.save(usr);
//		
//		mv = new ModelAndView("login");
//		mv.addObject("login", new LoginForm());
//		mv.addObject("message", "Registration completed.");
//		
//		return mv;
//	}
}
