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
		System.out.println("BbsController login()");
		/*
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
		*/
		
		//System.out.println(user);
		
		
		UserDto dto = service.getUser(id);
		
		//System.out.println(dto);
		
		//System.out.println(id);
		
		//System.out.println(dto.getId());
		
		if(dto != null && dto.getId().equals(id) && dto.getPw().equals(pw)) {
			return "success";
		}else {
			return "fail";
		}
		
		
		
	}
	
	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public String signup(UserDto user) {
		System.out.println("BbsController signup()");
		service.addUser(user);
		return "success";
	}
}
