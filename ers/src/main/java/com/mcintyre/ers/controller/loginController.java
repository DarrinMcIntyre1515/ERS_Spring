package com.mcintyre.ers.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class loginController {

//	@Autowired
//	UserRepo repo;
//	ModelAndView mv = new ModelAndView();

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
	
	
//	@RequestMapping(value = {"login", ""}, method = RequestMethod.GET)
//	public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {
//		mv.setViewName("login");
//		mv.addObject("login", new LoginForm());
//		return mv;
//	}
//	
//	@RequestMapping(value = "logout", method = RequestMethod.GET)
//	public ModelAndView logout(HttpServletRequest request, HttpServletResponse response) {
//		mv.setViewName("logout");
//
////		mv.addObject("login", new LoginForm());
//		mv.addObject("message", "");
//		return mv;
//	}
//	
//	@RequestMapping(value = "registration", method = RequestMethod.GET)
//	public ModelAndView registerUser(HttpServletRequest request, HttpServletResponse response) {
//		mv.setViewName("register");
//
//		mv.addObject("user", new User());
//		return mv;
//	}
//	
//	@PostMapping(value = "verifyLogin")
//	public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
//			  @ModelAttribute("login") LoginForm login) {		
//		User usr = repo.findByUsernameOrEmail(login.getUsername(), login.getUsername());
//		
//		if(usr != null && usr.getPassword().contains(login.getPassword())) {
//			mv.setViewName("welcome");
//			mv.addObject("firstname", usr.getFirstname());
//		}
//		else {
//			mv.setViewName("login");
//			mv.addObject("message", "Incorrect username or password.");
//		}		
//		
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
