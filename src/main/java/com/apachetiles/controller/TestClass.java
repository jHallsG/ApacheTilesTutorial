package com.apachetiles.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestClass {
	
	@RequestMapping("/test")
	public String test(){
		return "parentpage";
	}

}
