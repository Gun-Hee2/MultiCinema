package com.one.multicinemaback.service;

import java.util.List;

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
	

	public List<MovieDto> getmovielist() {
		return dao.getmovielist();
	}
	
	public MovieDto getMovie(int seq) {
		return dao.getMovie(seq);
	}
	
	
	public void addmovie(MovieDto movie)
	{
		dao.addMovie(movie); 
	}
	
	public void updateScore(int seq) {
		dao.updateScore(seq);
	}
}
