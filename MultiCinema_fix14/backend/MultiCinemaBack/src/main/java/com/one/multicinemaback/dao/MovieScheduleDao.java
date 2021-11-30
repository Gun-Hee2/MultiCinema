package com.one.multicinemaback.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.one.multicinemaback.dto.MovieScheduleDto;

@Mapper
@Repository
public interface MovieScheduleDao {
	void addMS(MovieScheduleDto ms);
	List<MovieScheduleDto> mtitle(String sdate);
	List<MovieScheduleDto> mtime(String title);
	List<MovieScheduleDto> mmsnum(int msnum);
}
	