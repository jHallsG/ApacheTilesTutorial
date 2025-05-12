package com.apachetiles.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ApacheTilesController {
	
	@GetMapping("/home")
	public ModelAndView getParentPage(){
		ModelAndView mv = new ModelAndView("parentPage");
		return mv;
	}
	
	@GetMapping("/home/contactUs")
	public ModelAndView getContactPage(){
		ModelAndView mv = new ModelAndView("contactUsPage");
		mv.addObject("address","123 Heaven Valley, Upper Clouds");
		mv.addObject("phone", "12345678");
		mv.addObject("email","testemail@test.com");
		return mv;
	}
	
	@GetMapping("/home/homePage")
	public ModelAndView getHomePage(){
		ModelAndView mv = new ModelAndView("homePage");
		return mv;
	}
}
