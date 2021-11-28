package com.one.multicinemaback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.one.multicinemaback.dto.UserDto;
import com.one.multicinemaback.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService service;
	
	@RequestMapping(value = "/login", method =RequestMethod.POST)
	public String login(String id, String pw) {
		
		System.out.println("UserController login()");
		
		UserDto user = service.getUser(id);
		
		if(user==null)	
		{
			return "id";
		}
		else if(user.getPw().equals(pw))
		{
			return "success";
		}
		return "pw";
	}
	
	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public String signup(UserDto user) {
		
		System.out.println("UserController signup()");
		
		service.addUser(user);
		
		return "success";
	}
}
