package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.User;
import com.example.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/")
	public String index(){
		System.out.println("Home!");
		return "index";
	}
	
	@RequestMapping("/users")
	public String getAllUsers(ModelMap model){
		
		List<User> users = userService.findAllUsers();
		for(User user: users){
			System.out.println(user);
		}
		
		model.addAttribute("users", users);
		
		return "index";
	}
	
}
