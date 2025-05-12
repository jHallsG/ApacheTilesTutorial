package com.apachetiles.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.apachetiles.entity.UsersEntity;
import com.apachetiles.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/list")
	public String getUserList(Model model){
		
		List<UsersEntity> userList = userService.fetchAllUsers();
		
		for(UsersEntity users : userList){
			System.out.println(users.toString());
		}
		
		model.addAttribute("users", userList);
		
		return "userList";
	}
	
	@GetMapping("/add")
	public String newUser(Model model){
		
		// the jsp page contains the tag <form:form> which tells Spring there is going to be some data binding activity
		// we will add the "user" attribute to be binded to a new UserEntity instance
		model.addAttribute("user", new UsersEntity());
		
		return "newUser";
	}
	
	@PostMapping("/saveUser")
	public String saveNewUser(@ModelAttribute("user") UsersEntity user){
		
		System.out.println(user.getFirstName());
		System.out.println(user.getLastName());
		
		//userService.saveUser(user);
		
		return "redirect:/user/list";
		
	}
	
	
}
