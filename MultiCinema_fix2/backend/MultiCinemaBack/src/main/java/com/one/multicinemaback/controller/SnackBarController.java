package com.one.multicinemaback.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.one.multicinemaback.dto.SnackBarDto;
import com.one.multicinemaback.service.SnackBarService;

@RestController
public class SnackBarController {
	
	@Autowired
	SnackBarService sbservice;
	
	@RequestMapping(value = "/snackbar", method =RequestMethod.GET)
	public List<SnackBarDto> snackbar(String category) {
		System.out.println("SnackBarController snackbar()");
		
		List<SnackBarDto> list = sbservice.snackbarlist(category);
		
		return list;
	}

}
