package com.one.multicinemaback.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.one.multicinemaback.dto.SnackBarDto;
import com.one.multicinemaback.dto.UserDto;
import com.one.multicinemaback.service.SnackBarService;
import com.one.multicinemaback.service.UserService;

@RestController
public class SnackBarController {
	
	@Autowired
	SnackBarService sbservice;
	@Autowired
	UserService uservice;
	
	@RequestMapping(value = "/snackbarlist", method =RequestMethod.GET)
	public List<SnackBarDto> snackbarlist(String category) {
		System.out.println("SnackBarController snackbar()");
		
		List<SnackBarDto> list = sbservice.snackbarlist(category);
		
		return list;
	}
	
	@RequestMapping(value = "/snackbardetail", method =RequestMethod.GET)
	public SnackBarDto snackbardetail(String product) {
		System.out.println("SnackBarController snackbardetail()");
		
		System.out.println(product);
		
		SnackBarDto sbdetail = sbservice.snackbardetail(product);
		
		return sbdetail;
	}
	
	@RequestMapping(value = "/sgetuser", method =RequestMethod.POST)
	public UserDto sgetuser(String id) {
		System.out.println("SnackBarController sgetuser()");
		System.out.println(id);
		
		UserDto user = uservice.getUser(id);
		
		return user;
	}

}
