package com.one.multicinemaback.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.one.multicinemaback.dto.MovieDto;

@Mapper
@Repository
public interface MovieDao {
	void addMovie(MovieDto movie);
}