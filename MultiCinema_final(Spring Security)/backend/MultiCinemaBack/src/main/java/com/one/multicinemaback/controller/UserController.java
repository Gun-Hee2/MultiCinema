package com.one.multicinemaback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.one.multicinemaback.dto.UserDto;
import com.one.multicinemaback.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService service;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@RequestMapping(value = "/login", method =RequestMethod.POST)
	public UserDto login(String id, String pw) {
		
		System.out.println("UserController login()");
		
		UserDto user = service.getUser(id);
		System.out.println(user);
		if(user==null)	
		{
			return null;
		}
		else if(passwordEncoder.matches(pw, user.getPw()))
		{
			user.setPw("");
			return user;
		}
		return null;
	}
	
	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public String signup(UserDto user) {
		
		System.out.println("UserController signup()");
		
		String encodedPassword = passwordEncoder.encode(user.getPw());
		
		user.setPw(encodedPassword);
		
		service.addUser(user);
		
		return "success";
	}
}
