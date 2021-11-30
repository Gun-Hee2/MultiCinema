package com.one.multicinemaback.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.one.multicinemaback.dao.MovieScheduleDao;
import com.one.multicinemaback.dto.MovieScheduleDto;

@Service
@Transactional
public class MovieScheduleService {
	
	@Autowired
	MovieScheduleDao dao;
	
	public void addMS(MovieScheduleDto ms) {
		dao.addMS(ms);
	}
	
	public List<MovieScheduleDto> mtitle(String sdate) {
		return dao.mtitle(sdate);
	}
	
	public List<MovieScheduleDto> mtime(String title){
		return dao.mtime(title);
	}
	
	public List<MovieScheduleDto> mmsnum(int msnum){
		return dao.mmsnum(msnum);
	}
}
