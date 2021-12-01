package com.one.multicinemaback.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.one.multicinemaback.dto.MovieDto;

@Mapper
@Repository
public interface MovieDao {
	void addMovie(MovieDto movie);
	List<MovieDto> getmovielist();
	MovieDto getMovie(int seq);
	public void updateScore(int seq);
}