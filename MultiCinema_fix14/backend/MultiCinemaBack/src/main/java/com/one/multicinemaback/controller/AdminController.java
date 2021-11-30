package com.one.multicinemaback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.one.multicinemaback.dto.ActorDto;
import com.one.multicinemaback.dto.MovieDto;
import com.one.multicinemaback.dto.MovieScheduleDto;
import com.one.multicinemaback.dto.SnackBarDto;
import com.one.multicinemaback.service.ActorService;
import com.one.multicinemaback.service.MovieScheduleService;
import com.one.multicinemaback.service.MovieService;
import com.one.multicinemaback.service.SnackBarService;

@RestController
public class AdminController {
	
	@Autowired
	MovieScheduleService msService;

	@Autowired
	ActorService aService;

	@Autowired
	MovieService mService;
	
	@Autowired
	SnackBarService sService;
	
	//배우 추가
	@RequestMapping(value="/actor", method=RequestMethod.POST)
	public String addActor(ActorDto actor) {
		
		System.out.println("AdminController addActor()");
		
		aService.addActor(actor);
		
		return "success";
	}
	
	//영화 추가
	@RequestMapping(value="/movie", method=RequestMethod.POST)
	public String addMovie(MovieDto movie) {
		
		System.out.println("AdminController addMoive()");
		
		mService.addmovie(movie);
		
		return "success";
	}
	
	//영화 스케쥴 추가
	@RequestMapping(value="/ms", method=RequestMethod.POST)
	public String addMS(MovieScheduleDto ms) {
		
		System.out.println("AdminController addMS()");
		
		msService.addMS(ms);
		
		return "success";
	}
	
	//스낵바 추가
	@RequestMapping(value="/snackbar", method=RequestMethod.POST)
	public String addSnackBar(SnackBarDto product) {
		
		System.out.println("AdminController addSnackBar()");
		
		sService.addSnackBar(product);
		
		return "success";
	}
}
