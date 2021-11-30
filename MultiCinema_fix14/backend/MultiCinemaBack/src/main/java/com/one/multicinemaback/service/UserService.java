package com.one.multicinemaback.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.one.multicinemaback.dao.UserDao;
import com.one.multicinemaback.dto.UserDto;

@Service
@Transactional
public class UserService {
	
	@Autowired
	UserDao dao;
	
	public void addUser(UserDto user) {
		dao.addUser(user);
	}
	
	public UserDto getUser(String id) {
		return dao.getUser(id);
	}
	
	public void pwUp(String pw) {
		dao.pwUp(pw);
	}
	
	public void emailUp(String email) {
		dao.emailUp(email);
	}
}
