package com.one.multicinemaback.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.one.multicinemaback.dao.MovieDao;
import com.one.multicinemaback.dto.MovieDto;

@Service
@Transactional
public class MovieService {
	
	@Autowired
	MovieDao dao;
	
	public void addmovie(MovieDto movie)
	{
		dao.addMovie(movie); 
	}
}
