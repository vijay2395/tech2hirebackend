package com.spendinaday.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spendinaday.model.User;
import com.spendinaday.service.UserService;


@RestController
@CrossOrigin()
public class UserController {

	
	@RequestMapping("/")
	public String getMsg() {
		// TODO Auto-generated method stub
		return "Welcome to Spend in a Day API!";
		
	}
	
	
	@Autowired
	UserService welcomeService;
	
	@RequestMapping("/adduser")
	private String addUser(@RequestBody User user) {
		// TODO Auto-generated method stub
		welcomeService.addUser(user);
		
		return null;
	}
	
	@GetMapping("/getUser/{id}")
	private User getUser(@PathVariable("id") int id) {
		// TODO Auto-generated method stub
		User user=welcomeService.getUser(id);
		
		return user;
	}
}
