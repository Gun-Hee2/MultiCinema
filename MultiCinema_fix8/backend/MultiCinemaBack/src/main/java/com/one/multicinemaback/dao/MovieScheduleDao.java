package com.one.multicinemaback.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.one.multicinemaback.dto.MovieScheduleDto;

@Mapper
@Repository
public interface MovieScheduleDao {
	void addMS(MovieScheduleDto ms);
}
	