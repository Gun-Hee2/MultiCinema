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
	
	// 회원가입
	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public String signup(UserDto user) {
		
		System.out.println("UserController signup()");
		
		// passwordEncoder.encode를 통해 ajax를 통해 입력받은 비밀번호를 암호화 
		String encodedPassword = passwordEncoder.encode(user.getPw());
		
		user.setPw(encodedPassword);
		
		service.addUser(user);
		
		return "success";
	}
	
	// 로그인
	@RequestMapping(value = "/login", method =RequestMethod.POST)
	public UserDto login(String id, String pw) {
		
		System.out.println("UserController login()");
		
		UserDto user = service.getUser(id);
		System.out.println(user);
		if(user==null)	
		{
			return null;
		}
		// 로그인 페이지에서 ajax를 통해 입력받은 비밀번호와 회원정보에 해당되는 비밀번호와 일치하는지 
		else if(passwordEncoder.matches(pw, user.getPw()))
		{
			user.setPw("");
			return user;
		}
		return null;
	}
}
